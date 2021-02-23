package com.ekomuliyo.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<String> oneStream = Stream.of("Eko");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = "Muliyo";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> streamString = Stream.of("Eko", "Muliyo", "Palembang");
        streamString.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,10);
        integerStream.forEach(System.out::println);

        String[] arrayString = new String[] {
          "Eko", "Muliyo", "Palembang"
        };
        Stream<String> streamFromArrray = Arrays.stream(arrayString);
        streamFromArrray.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collectionString = List.of("Eko", "Muliyo", "Palembang");
        Stream<String> stringStream = collectionString.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamInfinite() {
        Stream<String> streamGenerate = Stream.generate(() -> "Eko Muliyo");
        streamGenerate.forEach(System.out::println);

        Stream<Integer> streamIterate = Stream.iterate(1, value -> value + 1);
        streamIterate.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Eko");
        builder.add("Muliyo").add("Palembang");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Eko").add("Muliyo").add("Palembang").build();
        stream.forEach(System.out::println);
    }
}
