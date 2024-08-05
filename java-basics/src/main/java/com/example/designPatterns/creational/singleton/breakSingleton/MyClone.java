package com.example.designPatterns.creational.singleton.breakSingleton;

public class MyClone implements Cloneable{

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
}
