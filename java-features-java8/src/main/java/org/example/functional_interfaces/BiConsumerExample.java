package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();


    /*
     * c3.andThen(c4) is a chained Consumer that takes a Student and returns nothing.
     */
    public static void printNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }


    public static void main(String[] args) {
        printNameAndActivities();
    }
}
