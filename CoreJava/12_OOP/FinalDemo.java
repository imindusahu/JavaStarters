/*
 * Topic  : OOP
 * Program: final Keyword
 * Author : Indu Sahu
 * Purpose: Demonstrate final variable, method and class.
 */

class Vehicle {

    final int MAX_SPEED = 120;

    final void start() {
        System.out.println("Vehicle starts");
    }
}

final class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class FinalDemo {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Maximum Speed: " + car.MAX_SPEED);

        car.start();
        car.drive();
    }
}