package com.ekomuliyo.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateIsBlank = s -> s.isBlank();

        System.out.println(predicateIsBlank.test(""));
        System.out.println(predicateIsBlank.test("Eko"));

    }
}
