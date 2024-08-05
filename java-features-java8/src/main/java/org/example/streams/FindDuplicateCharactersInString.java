package org.example.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        // Find Duplicate Characters in a String
        String str = "Java is a programming language";
        Stream<Map.Entry<Character, Long>> entryStream = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1);

        entryStream
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));


        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        freqMap.forEach(
                (k, v) -> {
                    if (v > 1)
                        System.out.println(k + " : " + v);
                });


        Runnable runnable = () -> System.out.println("Inside Runnable 1");
//        test(runnable);

    }



//    lambda => implementation of functional interface
//    functional interface => interface with only one abstract method (SAM)
//


}
