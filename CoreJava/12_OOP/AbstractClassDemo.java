/*
 * Topic  : OOP
 * Program: Abstract Class
 * Author : Indu Sahu
 * Purpose: Demonstrate the features of an abstract class.
 */

abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor");
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println(brand + " stops");
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
        System.out.println("Car constructor");
    }

    @Override
    void start() {
        System.out.println(brand + " starts");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Toyota");

        vehicle.start();
        vehicle.stop();
    }
}