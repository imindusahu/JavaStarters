/*
 * Topic  : OOP
 * Program: toString()
 * Author : Indu Sahu
 * Purpose: Demonstrate overriding toString() method.
 */

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ToStringDemo {

    public static void main(String[] args) {

        Student student = new Student("Indu", 22);

        System.out.println(student);
        System.out.println(student.toString());
    }
}