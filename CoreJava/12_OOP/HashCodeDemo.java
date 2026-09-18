/*
 * Topic  : OOP
 * Program: hashCode()
 * Author : Indu Sahu
 * Purpose: Demonstrate the relationship between equals() and hashCode().
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

    @Override
    public int hashCode() {

        return 31 * name.hashCode() + age;
    }
}

public class HashCodeDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Indu", 22);
        Student student2 = new Student("Indu", 22);
        Student student3 = new Student("Yash", 23);

        System.out.println("student1.equals(student2): "
                + student1.equals(student2));

        System.out.println("student1 hashCode: "
                + student1.hashCode());

        System.out.println("student2 hashCode: "
                + student2.hashCode());

        System.out.println("student3 hashCode: "
                + student3.hashCode());

        System.out.println("student1 and student2 have same hashCode: "
                + (student1.hashCode() == student2.hashCode()));
    }
}