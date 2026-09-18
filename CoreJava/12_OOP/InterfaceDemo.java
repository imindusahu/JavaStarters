/*
 * Topic  : OOP
 * Program: Interface
 * Author : Indu Sahu
 * Purpose: Demonstrate interface and implementation in Java.
 */

interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Payment payment = new UPI();

        payment.pay();
    }
}