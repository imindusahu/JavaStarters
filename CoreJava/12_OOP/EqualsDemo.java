/*
 * Topic  : OOP
 * Program: equals()
 * Author : Indu Sahu
 * Purpose: Demonstrate overriding equals() to compare object data.
 */

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.age == other.age &&
               this.name.equals(other.name);
    }
}

public class EqualsDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Indu", 22);
        Student student2 = new Student("Indu", 22);
        Student student3 = new Student("Yash", 23);

        System.out.println("student1 == student2: " + (student1 == student2));

        System.out.println("student1.equals(student2): "
                + student1.equals(student2));

        System.out.println("student1.equals(student3): "
                + student1.equals(student3));
    }
}