package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 55, 6, 7, 88, 9};

        Arrays.stream(arr)
//                .distinct()
                .sorted()
                .skip(arr.length - 2)
                .findFirst()
                .ifPresent(secondLargest -> System.out.println("Second Largest: " + secondLargest));


        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(secondLargest -> System.out.println("Second Largest: " + secondLargest));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 55, 6, 7, 88, 9);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .ifPresent(secondLargest -> System.out.println("Second Largest: " + secondLargest));


    }
}
