package com.ekomuliyo.app;

import com.ekomuliyo.util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // method reference static method
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // tipe parameter dan return nya harus sesuai

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("EKO"));

        // method reference parameter
        // Function<String, String> functionUpper = s -> s.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase; // tidak boleh mempunyai paramter

        System.out.println(functionUpper.apply("Eko"));
    }

    public void run() {
        // method reference non static method
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("EKO"));
    }

    public void run2() {
        // method reference object
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("EKO"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
