/*
 * Topic  : Exception Handling
 * Program: CustomExceptionDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate creating and using a custom exception.
 */

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        double balance = 5000;
        double amount = 7000;

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}