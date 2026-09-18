/*
 * Topic  : OOP
 * Program: static Keyword
 * Author : Indu Sahu
 * Purpose: Demonstrate static variable and static method.
 */

class Student {

    String name;
    static String college = "SRMCEM";

    Student(String name) {
        this.name = name;
    }

    void displayStudent() {
        System.out.println("\nName: " + name);
        System.out.println("College: " + college);
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Indu");
        Student student2 = new Student("Yash");

        student1.displayStudent();
        System.out.println();

        student2.displayStudent();
        System.out.println();

        Student.displayCollege();
    }
}