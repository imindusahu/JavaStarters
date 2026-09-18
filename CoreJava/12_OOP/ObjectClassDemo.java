/*
 * Topic  : OOP
 * Program: Object Class
 * Author : Indu Sahu
 * Purpose: Demonstrate that every Java class inherits from Object.
 */

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ObjectClassDemo {

    public static void main(String[] args) {

        Student student = new Student("Indu");

        System.out.println(student.getClass().getName());
        System.out.println(student instanceof Object);
    }
}