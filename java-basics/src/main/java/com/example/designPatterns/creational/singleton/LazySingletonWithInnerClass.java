package com.example.designPatterns.creational.singleton;

public class LazySingletonWithInnerClass {

    private LazySingletonWithInnerClass() {
        // private constructor to avoid client applications to use constructor
    }

    private static class SingletonHelper {
        private static final LazySingletonWithInnerClass INSTANCE = new LazySingletonWithInnerClass();

        private SingletonHelper() {
            // private constructor to avoid client applications to use constructor
        }
    }

    public static LazySingletonWithInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        LazySingletonWithInnerClass singleton = LazySingletonWithInnerClass.getInstance();
        LazySingletonWithInnerClass anotherSingleton = LazySingletonWithInnerClass.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

    }
}