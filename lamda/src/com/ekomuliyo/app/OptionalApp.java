package com.ekomuliyo.app;

import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("eko");
        sayHello(null);

    }

    public static void sayHello(String name) {
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("HELLO " + value),
                        () -> System.out.println("HELLO")
                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO : " + upperName);
    }
}
