/*
 * Topic  : Exception Handling
 * Program: TryCatchDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate basic try-catch exception handling.
 */

public class TryCatchDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 10;
        int b = 0;

        try {

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program ended");
    }
}