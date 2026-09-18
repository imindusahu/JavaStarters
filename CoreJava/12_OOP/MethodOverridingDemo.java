class Person {

    String name;

    void work() {
        System.out.println(name + " is working.");
    }
}

class Student extends Person {

    @Override
    void work() {
        System.out.println(name + " is studying.");
    }
}

class Teacher extends Person {

    @Override
    void work() {
        System.out.println(name + " is teaching.");
    }
}

class Developer extends Person {

    @Override
    void work() {
        System.out.println(name + " is developing software.");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        System.out.println("\n========= METHOD OVERRIDING =========\n");

        Student student = new Student();
        student.name = "Indu";

        Teacher teacher = new Teacher();
        teacher.name = "Yash";

        Developer developer = new Developer();
        developer.name = "Yuvraj";

        student.work();
        teacher.work();
        developer.work();
    }
}