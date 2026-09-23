/*
 * Topic  : Exception Handling
 * Program: ExceptionMessageDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate how to retrieve exception information.
 */

public class ExceptionMessageDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        try {

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception type: "
                    + e.getClass().getSimpleName());

            System.out.println("Exception message: "
                    + e.getMessage());
        }

        System.out.println("Program ended");
    }
}