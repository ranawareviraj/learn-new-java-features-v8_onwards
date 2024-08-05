package com.example.static_nonstatic;

public class MyClass {
    private final int n1;
    private final int n2;

    public MyClass(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Cannot access this in static context
    public static void test() {
//        System.out.println(this.n1);
    }

    public void test2() {
        System.out.println(this.n1);
        System.out.println(this.n2);
    }

}
