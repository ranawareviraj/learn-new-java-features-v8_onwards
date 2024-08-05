package org.example.streams;

import java.util.List;

public class FindUniqueElementsFromList {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "C++", "JavaScript", "C#", "Ruby", "Java", "Python", "C++", "JavaScript", "C#", "Ruby");
        List<String> distinctElements = list.stream().distinct().toList();
        System.out.println(distinctElements);
    }
}
