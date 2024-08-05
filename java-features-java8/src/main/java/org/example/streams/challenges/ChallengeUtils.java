package org.example.streams.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeUtils {
    public static final String COLOR_BLUE = "blue";
    public static final String COLOR_GREY = "grey";
    public static final String COLOR_RED = "red";

    private ChallengeUtils() {

    }

    static List<Employee> getEmployees() {
        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000.0),
                new Employee("Hannah", 24, "developer", 95000.0),
                new Employee("Bart", 50, "sales executive", 100000.0),
                new Employee("Sophie", 49, "construction worker", 40000.0),
                new Employee("Darren", 38, "writer", 50000.0),
                new Employee("Nancy", 29, "developer", 75000.0),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
        return employees;
    }

    static Car[] getCars() {
        // Create a list containing only Blue cars
        return new Car[]{
                new Car("Chevy", COLOR_RED, 45000f),
                new Car("Ford", COLOR_BLUE, 23000f),
                new Car("Toyota", COLOR_GREY, 14000f),
                new Car("Lamborghini", COLOR_BLUE, 150000f),
                new Car("Renault", COLOR_BLUE, 150000f),
        };
    }

    static Person[] getPeople() {
        return new Person[]{
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
    }






}
