package org.example.strings;

public class StringSCPDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str1 == str4.intern(): " + (str1 == str4.intern()));

        System.out.println();

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4.intern()): " + str3.equals(str4.intern()));

        // intern() demo
        System.out.println(str1.hashCode());
        System.out.println(str4.intern().hashCode());
    }
}

/*
    Why strings are immutable in Java?
        1. String Pool - No need to create multiple objects in the pool for same string.
        2. Security - String is used in class loading, file handling, networking, security etc.
        3. Synchronization - String is thread safe.
        4. HashCode - String is used in HashMap, HashTable etc. - as hashcode is cached at the time of creation.
 */

/*
    Output:
    str1 == str2: true
    str1 == str3: false
    str3 == str4: false
    str1 == str4.intern(): true

    str1.equals(str2): true
    str1.equals(str3): true
    str1.equals(str4.intern()): true
    69609650
    69609650
 */

