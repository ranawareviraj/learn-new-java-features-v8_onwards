package com.example.designPatterns.creational.singleton;

/**
 * This class demonstrates the "double-checked locking" pattern used to create a singleton object in a multithreaded environment.
 * The double-checking of instance == null ensures that only one instance of the singleton object is created.
 */
public class LazySingletonSynchronized {

    // The singleton instance. This is declared as volatile to ensure proper visibility semantics.
    private static volatile LazySingletonSynchronized instance;

    /**
     * Private constructor to avoid client applications to use constructor.
     */
    private LazySingletonSynchronized() {
    }

    /**
     * Returns the singleton instance. Uses double-checked locking to ensure that only one instance is created.
     *
     * @return the singleton instance
     */
    public static LazySingletonSynchronized getInstance() {
        // The first check is there to avoid the overhead of synchronization once the instance is created.
        if (instance == null) {
            // This block is synchronized on the class object of LazySingletonSynchronized.
            synchronized (LazySingletonSynchronized.class) {
                // This check ensures that no other thread has created the instance in the meantime.
                if (instance == null) {
                    // The instance is created within the synchronized block.
                    instance = new LazySingletonSynchronized();
                }
            }
        }

        // The instance is returned. If it was already created before, it will simply return the existing instance.
        return instance;
    }

    /**
     * Main method to test the singleton instance creation.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LazySingletonSynchronized singleton = LazySingletonSynchronized.getInstance();
        LazySingletonSynchronized anotherSingleton = LazySingletonSynchronized.getInstance();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // Instance is created only when we use it
        // This is a good approach
        // As it avoids resource wastage if object is costly to create
    }

}