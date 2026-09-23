/*
 * Topic  : Exception Handling
 * Program: ExceptionDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate an exception caused by division by zero.
 */

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        int result = a / b;

        System.out.println("Result: " + result);

        System.out.println("Program ended");
    }
}