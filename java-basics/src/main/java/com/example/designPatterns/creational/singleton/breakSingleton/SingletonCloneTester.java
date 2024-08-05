package com.example.designPatterns.creational.singleton.breakSingleton;

public class SingletonCloneTester {

    /**
     * Main method to test the singleton instance creation.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        LazySingletonNew singleton = LazySingletonNew.getInstance();
        LazySingletonNew anotherSingleton = (LazySingletonNew) singleton.clone(); // this throws CloneNotSupportedException

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // To avoid cloning issues, we can throw exception override the clone() method and
        // throw exception from the clone method
    }
}
