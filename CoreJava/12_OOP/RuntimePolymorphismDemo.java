class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    @Override
    void work() {
        System.out.println("Indu is studying.");
    }
}

class Teacher extends Person {

    @Override
    void work() {
        System.out.println("Yash is teaching.");
    }
}

class Developer extends Person {

    @Override
    void work() {
        System.out.println("Yuvraj is developing software.");
    }
}

class Manager extends Person {

    @Override
    void work() {
        System.out.println("Rohit is managing the team.");
    }
}

public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        // Runtime polymorphism: The method that gets called is determined at runtime based on the actual object type.
        System.out.println("\n========= RUNTIME POLYMORPHISM =========\n");

        Person person1 = new Student();
        Person person2 = new Teacher();
        Person person3 = new Developer();
        Person person4 = new Manager();

        // Runtime polymorphism or dynamic method dispatch
        person1.work();
        person2.work();
        person3.work();
        person4.work();
    }
}