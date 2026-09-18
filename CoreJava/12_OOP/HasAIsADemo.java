/*
 * Topic  : OOP
 * Program: Has-A vs Is-A
 * Author : Indu Sahu
 * Purpose: Demonstrate Is-A and Has-A relationships.
 */

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

// Is-A relationship
class Car extends Animal {

    // Has-A relationship
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class HasAIsADemo {

    public static void main(String[] args) {

        Car car = new Car();

        // Is-A
        car.eat();

        // Has-A
        car.drive();
    }
}