/*
 * Topic  : Collections - HashSet with Custom Objects
 * Program: HashSetCustomObjectDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate duplicate custom objects without
 *          overriding equals() and hashCode().
 */

import java.util.HashSet;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
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

        return this.id == other.id
                && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return 31 * id + name.hashCode();
    }
}

public class HashSetCustomObjectDemo {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student(101, "Indu");
        Student s2 = new Student(101, "Indu");

        students.add(s1);
        students.add(s2);

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        System.out.println("\ns1 == s2: " + (s1 == s2));

        System.out.println("s1.equals(s2): " + s1.equals(s2));

        System.out.println("\nHashSet: " + students);
        System.out.println("HashSet size: " + students.size());
    }
}