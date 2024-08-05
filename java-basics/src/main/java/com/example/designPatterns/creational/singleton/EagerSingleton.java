package com.example.designPatterns.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor to avoid client applications to use constructor
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        EagerSingleton anotherSingleton = EagerSingleton.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // Instance is created even if we don't use it
        // This is not a good approach
        // As it could lead to resource wastage if object is costly to create
    }
}
