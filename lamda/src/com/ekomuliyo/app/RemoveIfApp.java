package com.ekomuliyo.app;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Eko", "Muliyo", "Palembang"));

        // lamda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);

    }
}
