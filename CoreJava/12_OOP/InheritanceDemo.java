class Person {

    String name;
    int age;

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Student extends Person {

    String course;

    void study() {
        System.out.println(name + " is studying " + course + ".");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("\n========= INHERITANCE =========\n");

        Student student1 = new Student();
        student1.name = "Indu";
        student1.age = 22;
        student1.course = "Java";

        Student student2 = new Student();
        student2.name = "Yash";
        student2.age = 23;
        student2.course = "Spring Boot";

        Student student3 = new Student();
        student3.name = "Yuvraj";
        student3.age = 24;
        student3.course = "Backend Development";

        student1.displayPersonDetails();
        student1.eat();
        student1.study();

        System.out.println();

        student2.displayPersonDetails();
        student2.eat();
        student2.study();

        System.out.println();

        student3.displayPersonDetails();
        student3.eat();
        student3.study();
    }
}