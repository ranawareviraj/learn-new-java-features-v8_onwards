package org.example.functional_interfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    // Consumer is a functional interface that takes an argument and returns nothing.
    // It has an abstract method called accept() that takes an argument and returns nothing.
    // It has a default method called andThen() that takes a Consumer and returns a Consumer.

    // Consumer 1 of type String
    static Consumer<String> c1 = (s) -> System.out.println(s);

    // Consumer 2 of type Student
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(": " + student.getActivities());

    public static void printName() {
        // We can use Consumer this way:
        Consumer<Student> c2 = (student) -> System.out.print(student);
        studentList.forEach(c2);
        System.out.println("=====================================");

        // or this way:
        studentList.forEach((student) -> System.out.println(student));
    }

    /*
     * c3.andThen(c4) is a chained Consumer that takes a Student and returns nothing.
     */
    public static void printNameAndActivities() {
        studentList.forEach(c3.andThen(c4));
    }

    /*
     * c3.andThen(c4) is a chained Consumer that takes a Student, applies conditions and returns nothing.
     */
    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("==================" + " Students with grade level >= 3 and gpa >= 3.9 " + "===================");
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        c1.accept("java8");

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();


        // ForEach() is a default method in the Iterable interface that takes a Consumer and returns nothing.
        // It is used to iterate over a collection and perform some operation on each element of the collection.
        // It does  not return anything.
        // It takes a Consumer as an argument or we can pass a lambda expression to it.
        List<String> names = Arrays.asList("John", "Doe", "Jane", "Adam", "Tom");

        List<Integer> numbers = new ArrayList<>();
        names.forEach(name -> numbers.add(name.length()));
        System.out.println(numbers);
    }
}
