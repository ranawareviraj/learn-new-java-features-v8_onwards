package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer reduced = nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .peek(System.out::println)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + reduced);

    }
}
