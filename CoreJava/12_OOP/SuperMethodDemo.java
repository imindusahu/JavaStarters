class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    @Override
    void work() {

        System.out.println("Student is studying.");

        super.work();
    }
}

public class SuperMethodDemo {

    public static void main(String[] args) {

        System.out.println("========= SUPER METHOD =========");

        Student student = new Student();

        student.work();
    }
}