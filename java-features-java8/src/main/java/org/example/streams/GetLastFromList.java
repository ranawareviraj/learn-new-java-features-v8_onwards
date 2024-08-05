package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetLastFromList {
    // Java Program To print Last Element From List of Strings Using Java 8
    public static void main(String[] args) {
        // create a list of strings
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "C#", "Ruby"));

        // print the list
        System.out.println("List of strings: " + list);

        // remove the last element from the list using java 8
        list.stream().skip(list.size() - 1).forEach(System.out::println);

       String last = list.stream().skip(list.size() - 1).findFirst().get();
        // print the list after removing the last element
        System.out.println("The last element: " + last);
    }
}
