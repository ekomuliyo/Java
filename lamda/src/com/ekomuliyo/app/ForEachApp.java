package com.ekomuliyo.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Eko", "Muliyo", "Palembang");

        // lamda
        list.forEach(value -> System.out.println(value) );

        // method reference
        list.forEach(System.out::println);
    }
}
