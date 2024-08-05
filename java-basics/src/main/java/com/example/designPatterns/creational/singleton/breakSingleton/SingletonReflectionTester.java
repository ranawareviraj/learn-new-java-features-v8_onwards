package com.example.designPatterns.creational.singleton.breakSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionTester {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingletonNew singleton = LazySingletonNew.getInstance();
        LazySingletonNew anotherSingleton = null;

        Constructor[] constructors = LazySingletonNew.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            // Below code will destroy the singleton pattern
            constructor.setAccessible(true);
            anotherSingleton = (LazySingletonNew) constructor.newInstance();
        }

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // To avoid reflection issues, we can throw exception from the private constructor
    }
}
