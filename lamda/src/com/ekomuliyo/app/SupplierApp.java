package com.ekomuliyo.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Eko Muliyo";

        System.out.println(supplier.get());

    }
}
