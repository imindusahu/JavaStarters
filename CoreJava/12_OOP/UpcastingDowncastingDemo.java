class Person {

    void work() {
        System.out.println("Person is working.");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Indu is studying Java.");
    }

    @Override
    void work() {
        System.out.println("Indu is studying.");
    }
}

class Teacher extends Person {

    void teach() {
        System.out.println("Yash is teaching Java.");
    }

    @Override
    void work() {
        System.out.println("Yash is teaching.");
    }
}

public class UpcastingDowncastingDemo {

    public static void main(String[] args) {

        System.out.println("\n========= UPCASTING =========\n");

        Person person1 = new Student();

        person1.work();      // Student's overridden work()

        Person person2 = new Teacher();
        person2.work();      // Teacher's overridden work()


        System.out.println("\n========= DOWNCASTING =========\n");

        Student student = (Student) person1;

        student.work();
        student.study();     // Student-specific method

        Teacher teacher = (Teacher) person2;

        teacher.work();      
        teacher.teach();     // Teacher-specific method
    }
}