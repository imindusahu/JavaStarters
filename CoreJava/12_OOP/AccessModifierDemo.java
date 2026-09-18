/*
 * Topic  : OOP
 * Program: Access Modifiers
 * Author : Indu Sahu
 * Purpose: Demonstrate private and public access modifiers.
 */

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.deposit(2000);

        System.out.println("Balance: " + account.getBalance());

        // account.balance = 100000;  // ❌ Cannot access private variable
    }
}