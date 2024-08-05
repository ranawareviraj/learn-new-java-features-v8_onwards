package org.example.streams;

import java.util.stream.IntStream;

public class SumOfAllDigits {

    public static void main(String[] args) {
        // add all digits
        int num = 12345;

        IntStream intStream = String.valueOf(num).chars();

//        map(ch -> Character.getNumericValue(ch))
        int sum = intStream.
                map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
