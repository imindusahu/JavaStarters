/*
 * Topic  : OOP
 * Program: instanceof
 * Author : Indu Sahu
 * Purpose: Demonstrate the use of instanceof operator in Java.
 */

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class InstanceOfDemo {

    public static void main(String[] args) {

        Animal animal = new Dog();

        System.out.println("Is animal an Animal? " + (animal instanceof Animal));
        System.out.println("Is animal a Dog? " + (animal instanceof Dog));

        if (animal instanceof Dog) {

            Dog dog = (Dog) animal;

            dog.bark();
        }
    }
}