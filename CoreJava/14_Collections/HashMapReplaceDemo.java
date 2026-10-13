/*
 * Topic  : Collections - HashMap replace()
 * Program: HashMapReplaceDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate replace() with custom objects.
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

public class HashMapReplaceDemo {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        Student s1 = new Student(101, "Indu", "CSE");
        Student s2 = new Student(102, "Yash", "CSE");

        students.put(101, s1);
        students.put(102, s2);

        System.out.println("Initial HashMap:");
        System.out.println(students);

        // --------------------------------------------------
        // 1. replace(key, value)
        // --------------------------------------------------

        Student updatedStudent =
                new Student(101, "Indu", "ECE");

        students.replace(101, updatedStudent);

        System.out.println("\nAfter replace(101, updatedStudent):");
        System.out.println(students);

        // --------------------------------------------------
        // 2. Conditional replace
        // --------------------------------------------------

        Student currentStudent =
                new Student(101, "Indu", "ECE");

        Student newStudent =
                new Student(101, "Indu", "IT");

        boolean replaced =
                students.replace(
                        101,
                        currentStudent,
                        newStudent
                );

        System.out.println("\nConditional replace successful? "
                + replaced);

        System.out.println("After conditional replace:");
        System.out.println(students);

        // --------------------------------------------------
        // 3. Conditional replace with wrong old value
        // --------------------------------------------------

        Student wrongStudent =
                new Student(101, "Aman", "CSE");

        Student anotherStudent =
                new Student(101, "Indu", "ME");

        boolean replacedAgain =
                students.replace(
                        101,
                        wrongStudent,
                        anotherStudent
                );

        System.out.println("\nConditional replace with wrong old value? "
                + replacedAgain);

        System.out.println("Final HashMap:");
        System.out.println(students);
    }
}