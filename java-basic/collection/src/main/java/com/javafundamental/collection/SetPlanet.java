package com.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        // set merupakan salah satu object collection,
        // yang memungkinkan isi data tidak bisa duplikasi / sama

        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earh");
        planets.add("earh");
        planets.add("earh");
        planets.add("earh");
        planets.add("earh");
        planets.add("mars");

        System.out.println("size planets awal : " + planets.size());

        for (String planet : planets) {
            System.out.println(" " + planet);
        }

        planets.remove("venus");
        System.out.println("size planets akhir : " + planets.size());
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            // looping data menggunakan Iterator
            System.out.println(" " + iterator.next());
        }


    }
}
