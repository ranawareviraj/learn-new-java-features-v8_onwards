package org.example.functional_interfaces;

import java.util.Comparator;

public class CustomComparatorDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
//        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println(comparator.compare(3, 2)); //  1
        System.out.println(comparator.compare(2, 3)); // -1

    }
}