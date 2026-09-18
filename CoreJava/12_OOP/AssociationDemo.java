/*
 * Topic  : OOP
 * Program: Association
 * Author : Indu Sahu
 * Purpose: Demonstrate association between Teacher and Student.
 */

class Student {

    void study() {
        System.out.println("Student is studying");
    }
}

class Teacher {

    void teach(Student student) {
        System.out.println("Teacher is teaching");
        student.study();
    }
}

public class AssociationDemo {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.teach(student);
    }
}