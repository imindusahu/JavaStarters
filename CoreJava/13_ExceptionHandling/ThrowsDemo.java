/*
 * Topic  : Exception Handling
 * Program: ThrowsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate the throws keyword.
 */

public class ThrowsDemo {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}