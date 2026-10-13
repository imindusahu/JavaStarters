/*
 * Topic  : Collections - HashMap remove()
 * Program: HashMapRemoveDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate remove() with custom objects.
 */

import java.util.HashMap;

class Student {

    int id;
    String name;
    String branch;

    Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + "'"
                + ", branch='" + branch + "'}";
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
                && this.name.equals(other.name)
                && this.branch.equals(other.branch);
    }

    @Override
    public int hashCode() {
        return 31 * id
                + name.hashCode()
                + branch.hashCode();
    }
}

public class HashMapRemoveDemo {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        Student s1 = new Student(101, "Indu", "CSE");
        Student s2 = new Student(102, "Yash", "CSE");
        Student s3 = new Student(103, "Yuvraj", "CSE");

        students.put(101, s1);
        students.put(102, s2);
        students.put(103, s3);

        System.out.println("Initial HashMap:");
        System.out.println(students);

        // --------------------------------------------------
        // 1. remove(key)
        // --------------------------------------------------

        Student removedStudent = students.remove(101);

        System.out.println("\nRemoved student:");
        System.out.println(removedStudent);

        System.out.println("\nAfter remove(101):");
        System.out.println(students);

        // --------------------------------------------------
        // 2. remove(key) for a key that does not exist
        // --------------------------------------------------

        Student missingStudent = students.remove(999);

        System.out.println("\nRemoved student with key 999:");
        System.out.println(missingStudent);

        // --------------------------------------------------
        // 3. Conditional remove(key, value)
        // --------------------------------------------------

        Student expectedStudent =
                new Student(102, "Yash", "CSE");

        boolean removed =
                students.remove(102, expectedStudent);

        System.out.println("\nConditional remove successful? "
                + removed);

        System.out.println("After conditional remove:");
        System.out.println(students);

        // --------------------------------------------------
        // 4. Conditional remove with wrong value
        // --------------------------------------------------

        Student wrongStudent =
                new Student(103, "Aman", "ECE");

        boolean removedWrong =
                students.remove(103, wrongStudent);

        System.out.println("\nConditional remove with wrong value? "
                + removedWrong);

        System.out.println("Final HashMap:");
        System.out.println(students);
    }
}