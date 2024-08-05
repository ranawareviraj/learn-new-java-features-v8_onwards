package com.example.designPatterns.creational.singleton.breakSingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class SingletonSerializationTester {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        LazySingletonNew singleton = LazySingletonNew.getInstance();

        // Serialize the object singleton.
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(singleton);
        out.close();

        // Deserialize the object singleton.
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        LazySingletonNew anotherSingleton = (LazySingletonNew) in.readObject();
        in.close();

        System.out.println(singleton);
        System.out.println(anotherSingleton);

        // To Avoid Serialization and Deserialization issues,
        // we can override the readResolve() method in the singleton class.
    }

}
