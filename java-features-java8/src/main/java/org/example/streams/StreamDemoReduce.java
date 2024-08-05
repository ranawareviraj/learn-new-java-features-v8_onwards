package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamDemoReduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Integer sum = integerList.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        BinaryOperator<Integer> getSum = (accumulator, x) -> {
            int result = accumulator + x;
            System.out.println("acc: " + accumulator + ", x: " + x + ", result: " + result);
            return result;
        };

        Optional<Integer> reducedSum = integerList.stream()
                .reduce(getSum);
        System.out.println(reducedSum);
    }
}
