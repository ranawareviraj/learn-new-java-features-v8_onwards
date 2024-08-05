package com.example.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        testHashMapMethod();
        System.out.println("=====================================");
        testLinkedHashMapMethod();
    }

    private static void testHashMapMethod() {
        Map<String, String> map = new HashMap<>();
        fillMap(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void testLinkedHashMapMethod() {
        Map<String, String> map = new LinkedHashMap<>();
        fillMap(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void fillMap(Map<String, String> map) {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        // Taking an empty string
        String str = null;
        // Getting length of a string
        System.out.println(str.length());
    }
}
