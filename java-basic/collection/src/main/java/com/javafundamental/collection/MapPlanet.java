package com.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        // map merupakan object collection
        // dimana struktur data memiliki sifat key-value

        Map<String, Planet> planetMap = new HashMap<>();
        planetMap.put("key-1", new Planet("Mercury", 0.06));
        planetMap.put("key-2", new Planet("Venus", 0.82));
        planetMap.put("key-3", new Planet("Earth", 1.00));
        planetMap.put("key-4", new Planet("Mars", 0.11));
        planetMap.put("key-4", new Planet("Mars-X", 0.11));
        planetMap.put("key-4", new Planet("Mars-Y", 0.11));

        System.out.println("size planets awal : "+ planetMap.size());
        for (String key: planetMap.keySet()) {
            System.out.println(" " + key + " : " + planetMap.get(key));
        }

        planetMap.remove("key-2");
        System.out.println("size planets akhir : "+ planetMap.size());
        for (Planet planet: planetMap.values()) {
            System.out.println(" " + planet);
        }
    }
}
