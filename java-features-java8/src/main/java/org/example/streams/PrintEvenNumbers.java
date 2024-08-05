package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 55, 6, 7, 88, 9);
        list.sort(Comparator.naturalOrder());
        System.out.println("Odd: ");
        list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

        System.out.println("\n\nEven:");
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
