/*
 * Topic  : Exception Handling
 * Program: ExceptionInterview3
 * Author : Indu Sahu
 * Purpose: Demonstrate catch block ordering.
 */

public class ExceptionInterview3 {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException");

        } catch (RuntimeException e) {

            System.out.println("RuntimeException");

        } catch (Exception e) {

            System.out.println("Exception");
        }

        System.out.println("Program ended");
    }
}

