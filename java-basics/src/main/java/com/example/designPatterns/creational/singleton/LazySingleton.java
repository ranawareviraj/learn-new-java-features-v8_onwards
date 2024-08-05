package com.example.designPatterns.creational.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // private constructor to avoid client applications to use constructor
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton anotherSingleton = LazySingleton.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // Instance is created only when we use it
        // This is a good approach
        // As it avoids resource wastage if object is costly to create
    }
}

