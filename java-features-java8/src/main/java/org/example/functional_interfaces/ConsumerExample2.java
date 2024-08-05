package org.example.functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example 1: Using Consumer with forEach to print each element
        Consumer<Integer> printConsumer = number -> System.out.print(number + " ");
        numbers.forEach(printConsumer);
        System.out.println();  // Print a newline after the elements

        // Example 2: Using Consumer to modify each element in the list
        Consumer<Integer> multiplyConsumer = number -> {
            // Multiply each element by 2
            System.out.print(number * 2 + " ");
        };
        numbers.forEach(multiplyConsumer);
        System.out.println();  // Print a newline after the modified elements
    }
}

