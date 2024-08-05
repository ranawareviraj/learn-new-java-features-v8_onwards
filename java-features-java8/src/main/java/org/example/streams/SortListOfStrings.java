package org.example.streams;

import java.util.List;

public class SortListOfStrings {
    public static void main(String[] args) {
        // Sort List of Strings
        List<String> list = List.of("Java", "Python", "C++", "JavaScript", "C#", "Ruby");
        List<String> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);
    }
}
