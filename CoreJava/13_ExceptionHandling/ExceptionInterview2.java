/*
 * Topic  : Exception Handling
 * Program: ExceptionInterview2
 * Author : Indu Sahu
 * Purpose: Demonstrate finally execution with return.
 */

public class ExceptionInterview2 {

    static int test() {

        try {

            return 10;

        } finally {

            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {

        int result = test();

        System.out.println("Result: " + result);
    }
}
