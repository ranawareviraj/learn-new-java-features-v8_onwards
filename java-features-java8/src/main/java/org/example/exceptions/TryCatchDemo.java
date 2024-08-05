package org.example.exceptions;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Test() call Result: " + test());
    }

    private static int test() {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
            return 0;
        }
    }
}
/*
    If finally block has return statement then it will override the return statement of try block.
 */
