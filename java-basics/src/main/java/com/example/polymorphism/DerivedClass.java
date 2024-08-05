package com.example.polymorphism;


public class DerivedClass extends BaseClass {

/*
  public final void show(){
    System.out.println("Derived class");
  }
 */

    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.show();
    }
}