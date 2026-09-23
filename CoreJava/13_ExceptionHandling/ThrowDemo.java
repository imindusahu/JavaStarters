/*
 * Topic  : Exception Handling
 * Program: ThrowDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate explicitly throwing an exception.
 */

public class ThrowDemo {

    public static void main(String[] args) {

        int age = -5;

        try {

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            System.out.println("Valid age: " + age);

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid age: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}