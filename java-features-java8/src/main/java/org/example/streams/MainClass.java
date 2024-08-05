package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, Java 8 features!");
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Hannah"));

        students.forEach(System.out::println);
    }
}
