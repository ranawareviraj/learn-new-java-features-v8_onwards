package com.example;

public class TestClass {
    public static void main(String[] args) {
        testIntegersMethod();
        testDoubleMethod();
    }

    private static void testIntegersMethod() {
        Integer n1 = 1;
        Integer n2 = 1;
        System.out.println(n1 == n2);

        /*
            * The Integer.valueOf() method is used to get the Integer instance representing the specified int value.
            * Integer values in range from -128 to 127 are cached, so the same objects are returned.
         */
        Integer n3 = 129;
        Integer n4 = 129;
        System.out.println(n3 == n4);
    }

    private static void testDoubleMethod() {
        Double n1 = 1.0;
        Double n2 = 1.0;
        System.out.println(n1 == n2);
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        Double n3 = 129.0;
        Double n4 = 129.0;
        System.out.println(n3 == n4);
    }
}
