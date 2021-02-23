package com.ekomuliyo.stream;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.*;

public class StreamOperationTest {

    @Test
    void testStreamMap() {

        List<String> names = List.of("Eko", "Muliyo", "Palembang");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(value -> value.toUpperCase());

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipeline() {

        List<String> listNames = List.of("Eko", "Muliyo", "Palembang");

        listNames.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(value -> System.out.println(value));
    }

    @Test
    void testIntermediateOperation() {
        // lazy

        List<String> names = List.of("Eko", "Muliyo", "Palembang");
        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                });
//        upper.forEach(System.out::println);
    }

    @Test
    void testTerminalOperation() {
        // lazy

        List<String> names = List.of("Eko", "Muliyo", "Palembang");
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr. " + upper;
                })
                .forEach(value -> { // fungsi forEach men trigger stream names dijalankan
                    System.out.println(value);
                });
    }

    @Test
    void testMapOperation() {
        List.of("Eko", "Muliyo", "Palembang").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Eko", "Muliyo", "Palembang").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFilteringOperation() {
        List.of("Eko", "Muliyo", "Palembang").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDisticOperation() {
        // distinct menghapus data duplikat
        List.of("Eko", "Muliyo", "Palembang", "Palembang").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    void testLimit() {
        List.of("Eko", "Muliyo", "Palembang", "Palembang").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Eko", "Muliyo", "Palembang", "Palembang").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        // ambil data selama kondisi true, jika false maka data berhenti diambil
        List.of("Eko", "Edo", "Muliyo", "Palembang", "Palembang").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        // hapus data selama kondisi true, jika false maka data berhenti di hapus
        List.of("Eko", "Edo", "Muliyo", "Palembang", "Palembang").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional =  List.of("Eko", "Muliyo", "Palembang", "Palembang").stream().findAny();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional =  List.of("Eko", "Muliyo", "Palembang", "Palembang").stream().findFirst();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testSorted() {
        List.of("Muliyo", "Eko", "Palembang").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        List.of("Muliyo", "Eko", "Palembang").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);

    }

    @Test
    void testMax() {
        List.of("Eko", "Muliyo", "Palembang", "Pedamaran").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Eko", "Muliyo", "Palembang", "Pedamaran").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Eko", "Muliyo", "Palembang", "Pedamaran").stream()
                .count();

        System.out.println(count);
    }

    @Test
    void testSum() {
         var result = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .reduce(0, (value, item) -> value + item);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .reduce(1, (value, item) -> value * item);
        System.out.println(factorial);
    }

    @Test
    void testAnyMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .anyMatch(number -> number > 20);
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .allMatch(number -> number > 0);
        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21).stream()
                .noneMatch(number -> number > 3);
        System.out.println(match);
    }

    @Test
    void testPeekAfter() {
        List.of("Eko", "Muliyo", "Palembang").stream()
                .peek(name -> System.out.println("Before change name to upper " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("change name to upper : " +upper ))
                .forEach(name -> System.out.println("final name : " + name));
    }

    @Test
    void testCreatePrimitiveStream() {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.builder().add(0.2).add(0.10).build();
        doubleStream.forEach(System.out::println);
    }

    @Test
    void testOperationsPrimitive() {
        IntStream intStream = IntStream.range(10, 200);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(0, 1000)
                .mapToObj(number -> "Number " + number)
                .forEach(System.out::println);
    }

    @Test
    void testCollectorsCollection() {

        Stream<String> stream = Stream.of("Eko", "Muliyo", "Palembang");

        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = stream.collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = stream.collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);
    }

    @Test
    void testMapCollection() {
        Map<String, Integer> map = Stream.of("Eko", "Muliyo", "Palembang").collect(Collectors.toMap(
                    name -> name,
                    name -> name.length()
                ));

        System.out.println(map);
    }

    @Test
    void testGroupingBy() {

        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> {
                    if(number > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));
        System.out.println(collect);
    }

    @Test
    void  testGroupingBy2() {
        Map<String, List<String>> map = Stream.of("Eko", "Muliyo", "Palembang")
                .collect(Collectors.groupingBy(name -> {
                    if(name.length() > 4) {
                        return "Panjang";
                    } else {
                        return "Pendek";
                    }
                }));
        System.out.println(map);
    }

    @Test
    void testPartitioningBy() {

        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(number -> number > 5));
        System.out.println(collect);

    }

    @Test
    void testPartitioningBy2() {

        Map<Boolean, List<String>> map = Stream.of("Eko", "Muliyo", "Palembang")
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(map);

    }

    @Test
    void testSequential() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }

    @Test
    void testParaller() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallelStream()
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }





}
