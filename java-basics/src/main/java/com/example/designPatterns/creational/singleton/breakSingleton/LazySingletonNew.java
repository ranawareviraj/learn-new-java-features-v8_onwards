package com.example.designPatterns.creational.singleton.breakSingleton;


import java.io.Serial;
import java.io.Serializable;

/**
 * This class extends MyClone and demonstrates a singleton pattern where the instance is created only when it is used.
 * It also prevents the singleton instance from being cloned.
 */
public class LazySingletonNew extends MyClone implements Serializable {

    // The singleton instance.
    private static LazySingletonNew instance;

    /**
     * Private constructor to avoid client applications to use constructor.
     */
    private LazySingletonNew() {
        // Avoiding instantiation through reflection.
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists");
        }

    }

    /**
     * Overrides the clone method from the MyClone class to prevent cloning of the singleton instance.
     *
     * @throws CloneNotSupportedException if a clone attempt is made
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

    /**
     * Returns the singleton instance. If the instance is null, a new instance is created.
     *
     * @return the singleton instance
     */
    public static LazySingletonNew getInstance() {
        if (instance == null) {
            instance = new LazySingletonNew();
        }
        return instance;
    }
}