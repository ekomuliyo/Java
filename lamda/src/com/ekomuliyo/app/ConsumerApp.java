package com.ekomuliyo.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Eko Muliyo");

    }
}
