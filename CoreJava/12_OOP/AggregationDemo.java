/*
 * Topic  : OOP
 * Program: Aggregation
 * Author : Indu Sahu
 * Purpose: Demonstrate aggregation using Department and Teacher.
 */

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching");
    }
}

class Department {

    private Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void conductClass() {
        System.out.println("Department is conducting class");
        teacher.teach();
    }
}

public class AggregationDemo {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Indu");

        Department department = new Department(teacher);

        department.conductClass();

        teacher.teach();
    }
}