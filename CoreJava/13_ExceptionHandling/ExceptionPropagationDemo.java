/*
 * Topic  : Exception Handling
 * Program: ExceptionPropagationDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate exception propagation between methods.
 */

public class ExceptionPropagationDemo {

    static void methodB() {

        System.out.println("Inside methodB");

        int result = 10 / 0;

        System.out.println("Result: " + result);
    }

    static void methodA() {

        System.out.println("Inside methodA");

        methodB();

        System.out.println("methodA completed");
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        try {

            methodA();

        } catch (ArithmeticException e) {

            System.out.println("Exception caught in main: "
                    + e.getMessage());
        }

        System.out.println("Program ended");
    }
}