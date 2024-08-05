package org.example.defaults;


import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsInList2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    public static void sortByName(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(student -> student.getName());
        Comparator<Student> gpaComparator = Comparator.comparing(student -> student.getGpa());
        studentList.sort(gpaComparator.thenComparing(nameComparator));
        System.out.println("\nAfter Sort: ");
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort: ");
        studentList.forEach(studentConsumer);

        sortByName(studentList);

        studentList.stream();

    }
}