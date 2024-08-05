package org.example.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 0 -> o1 == o2
                // 1 -> o1 > o2
                // -1 -> o1 < o2
                return o1.compareTo(o2);
            }
        };
        System.out.println("The result of comparing 3 with 2: " + comparator.compare(3, 2));


        // Java 8 Lambda
        Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
        Comparator<Integer> comparator2 = Integer::compareTo;
        Comparator<Integer> comparator3 = Comparator.naturalOrder();

        System.out.println("The result of comparing 3 with 2: " + comparator1.compare(3, 2));
        System.out.println("The result of comparing 3 with 2: " + comparator2.compare(3, 2));
        System.out.println("The result of comparing 3 with 2: " + comparator3.compare(3, 2));

    }
}
