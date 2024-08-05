package org.example.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemoMap {

    public static void main(String[] args) {

        String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik", "Samantha", "Sara", "David", "Programmer"};
        Arrays.stream(names)
                .map(String::toCharArray)  // Convert each name to a char array
                .collect(Collectors.toList())
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println();

        // Map name to List<Student> based on index
        List<Student> students = IntStream.range(0, names.length)
                .mapToObj(i -> new Student(i, names[i])) // map each index to a Student object
                .collect(Collectors.toList()); // collect into a List
        // Test: Print the students
        students.forEach(student -> System.out.println("ID: " + student.id + ", Name: " + student.name));
        System.out.println();

        HashMap<Integer, Student> studentHashMap = IntStream.range(0, names.length)
                .boxed() // Box the integer index to Integer objects
                .collect(Collectors.toMap(
                        i -> i, // Key: index
                        i -> new Student(i, names[i]), // Value: Student object
                        (s1, s2) -> s1, // Merge function (in case of duplicate keys)
                        HashMap::new)); // Supplier for the map
        System.out.println(studentHashMap);

    }
}
