package org.example.exceptions;

import jakarta.mail.MessagingException;

/**
 * Hello world!
 */
public class ExceptionDemo {
    public static void main(String[] args) throws MessagingException {
        System.out.println("Hello World!");
        test();
    }

    private static void test() throws MyException {
        System.out.println("Test");
    }
}
