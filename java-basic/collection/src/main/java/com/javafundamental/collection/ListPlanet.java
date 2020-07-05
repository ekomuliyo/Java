package com.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {

        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "andi";
        heroes[1] = "budi";

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planets awal :");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("index "+ i + " = " + planets.get(i));
        }

        planets.remove("venus");
        System.out.println("List planets akhir :");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("index "+ i + " = " + planets.get(i));
        }

    }
}
