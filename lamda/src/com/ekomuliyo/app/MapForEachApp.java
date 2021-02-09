package com.ekomuliyo.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("fir_name", "Eko");
        map.put("last_name", "Muliyo");
        map.put("address", "Palembang");

        // forEach anonymous class
        // map.forEach(new BiConsumer<String, String>() {
        //     @Override
        //     public void accept(String s, String s2) {
        //         System.out.println(s + ":" + s2);
        //     }
        // });

        // lamda
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
