package org.example.streams;

import java.util.Comparator;
import java.util.List;

public class FindMaxMinInList {
    public static void main(String[] args) {
        // Find the Maximum and Minimum Value in a List
        List<Integer> list = List.of(1, 2, 3, 4, 4, 55, 6, 7, 88, 9);
        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        // Find the Maximum and Minimum Value in a List
        list.stream()
                .max(Comparator.comparing(Integer::intValue))
                .ifPresent(maxValue -> System.out.println("Max: " + maxValue));

        list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .ifPresent(minValue -> System.out.println("Min: " + minValue));


        Integer minVal = list.stream()
                .min(Comparator.comparing(Integer::intValue))
                .get();
        System.out.println("Min: " + minVal);
    }
}
