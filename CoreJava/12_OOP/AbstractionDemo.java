/*
 * Topic  : OOP
 * Program: Abstraction
 * Author : Indu Sahu
 * Purpose: Demonstrate abstraction in Java.
 */

abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        vehicle.start();
        vehicle.stop();
    }
}