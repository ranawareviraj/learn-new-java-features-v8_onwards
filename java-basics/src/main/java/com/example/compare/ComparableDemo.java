package com.example.compare;

public class ComparableDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        Person person3 = new Person("Doe", 35);

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false

    }
}
