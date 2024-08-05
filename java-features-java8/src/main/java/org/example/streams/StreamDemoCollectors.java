package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemoCollectors {

    public static void main(String[] args) {

        // Filter names starting with "S" and sort them
        String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik", "Samantha", "Sara", "David", "Programmer"};
        List<String> namesStartingWithS = Arrays.stream(names)
                .filter(name -> name.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(namesStartingWithS);

        // Collectors.joining()
        System.out.println("\n------- Collectors.joining()) -------");
        String s = Arrays.stream(names)
                .collect(Collectors.joining("--**--"));
        System.out.println(s);

        // Collectors.toSet()
        System.out.println("\n------- Collectors.toSet() -------");
        Set<String> setOfNames = Arrays.stream(names)
                .collect(Collectors.toSet());
        System.out.println(setOfNames);

        // Collectors.toCollection(() -> new ArrayList()))
        System.out.println("\n------- Collectors.toCollection(() -> new ArrayList())) -------");
        ArrayList<String> namesArrayList = Arrays.stream(names)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(namesArrayList);


        // Grouping By
        System.out.println("\n------- Grouping By Length -------");
        Map<Integer, List<String>> namesGroupedByLength = Arrays.stream(names)
                .filter(name -> name.length() > 2)
                .collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(namesGroupedByLength);
    }
}
