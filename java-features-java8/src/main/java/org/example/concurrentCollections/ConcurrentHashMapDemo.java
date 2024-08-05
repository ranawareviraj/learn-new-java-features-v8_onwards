package org.example.concurrentCollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "One");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");

        System.out.println("concurrentHashMap: " + concurrentHashMap);

        // null key and value not allowed - throws NullPointerException
        //        concurrentHashMap.put(null, null);
    }
}
