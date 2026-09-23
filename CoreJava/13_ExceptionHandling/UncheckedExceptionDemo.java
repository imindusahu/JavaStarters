/*
 * Topic  : Exception Handling
 * Program: UncheckedExceptionDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate a custom unchecked exception.
 */

class InvalidAmountException extends RuntimeException {

    InvalidAmountException(String message) {
        super(message);
    }
}

public class UncheckedExceptionDemo {

    static void withdraw(double balance, double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than zero");
        }

        if (amount > balance) {
            throw new InvalidAmountException(
                    "Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        double balance = 5000;
        double amount = -100;

        try {

            withdraw(balance, amount);

        } catch (InvalidAmountException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program ended");
    }
}