class Person {

    String name = "Person";

    Person() {
        System.out.println("Person constructor called.");
    }

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    String name = "Indu";

    Student() {
        super();
        System.out.println("Student constructor called.");
    }

    @Override
    void work() {

        System.out.println("Student is studying.");

        System.out.println("Parent name: " + super.name);

        super.work();
    }
}

public class SuperConstructorDemo {

    public static void main(String[] args) {

        System.out.println("\n========= SUPER CONSTRUCTOR =========\n");

        Student student = new Student();

        student.work();
    }
}