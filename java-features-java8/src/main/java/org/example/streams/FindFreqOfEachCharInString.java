package org.example.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFreqOfEachCharInString {
    public static void main(String[] args) {
        // Find the Frequency of Each Character in a Given String
        String str = "Hello World";
        Map<Character, Long> countMap = str.chars()
                .filter(ch -> ch != ' ')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);

        // String to Stream of Characters
        str.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(System.out::println);
    }
}
