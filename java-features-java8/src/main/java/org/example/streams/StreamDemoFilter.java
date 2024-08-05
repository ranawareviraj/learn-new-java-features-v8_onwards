package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemoFilter {

    public static void main(String[] args) {

        // Filter names starting with "S" and sort them
        String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik", "Samantha", "Sara", "David", "Programmer"};
        List<String> namesStartingWithS = Arrays.stream(names)
                .filter(name -> name.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(namesStartingWithS);

        // Filter names with length greater than 5
        Predicate<String> isLongerThanFive = name -> name.length() > 5;
        List<String> namesWithLengthGreaterThanFive = Arrays.stream(names)
                .filter(isLongerThanFive)
                .collect(Collectors.toList());
        System.out.println(namesWithLengthGreaterThanFive);


        // Filter names with length greater than 5
        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> (str) -> str.length() > 3;
        Predicate<String> isLongerThanThree = createLengthTest.apply(3);
        Predicate<String> isLongerThanTwo = createLengthTest.apply(2);
        List<String> namesWithLengthGreaterThanThree = Arrays.stream(names)
                .filter(isLongerThanThree)
                .collect(Collectors.toList());
        System.out.println(namesWithLengthGreaterThanThree);


    }
}
