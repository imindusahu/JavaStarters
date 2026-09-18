class Person {

    String name = "Person";
    int age = 40;
}

class Student extends Person {

    String name = "Indu";
    int age = 22;

    void displayDetails() {

        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);

        System.out.println("Child Age: " + age);
        System.out.println("Parent Age: " + super.age);
    }
}

public class SuperVariableDemo {

    public static void main(String[] args) {

        System.out.println("========= SUPER VARIABLE =========");

        Student student = new Student();

        student.displayDetails();
    }
}