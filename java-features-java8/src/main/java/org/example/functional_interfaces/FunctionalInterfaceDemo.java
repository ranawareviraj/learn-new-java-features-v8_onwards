package org.example.functional_interfaces;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Anonymous inner class
        MyFunctionalInterface myFunctionalInterface = () -> 0;
        System.out.println(myFunctionalInterface.myAbstractMethod());
    }

    @FunctionalInterface
    public interface MyFunctionalInterface {
        // Single abstract method
        int myAbstractMethod();

        // Default method (optional)
        default void myDefaultMethod() {
            System.out.println("Default method implementation");
        }

        // Static method (optional)
        static void myStaticMethod() {
            System.out.println("Static method implementation");
        }
    }
}