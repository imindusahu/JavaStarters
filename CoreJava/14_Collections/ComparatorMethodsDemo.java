/*
 * Topic  : Collections - Comparator Methods
 * Program: ComparatorMethodsDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate important Comparator methods
 *          and custom sorting techniques.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int id;
    String name;
    double marks;
    long mobileNumber;

    Student(int id, String name, double marks, long mobileNumber) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + "'"
                + ", marks=" + marks
                + ", mobileNumber=" + mobileNumber + "}";
    }
}

public class ComparatorMethodsDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Yuvraj", 85.5, 9876543210L));
        students.add(new Student(101, "Indu", 92.5, 9876543211L));
        students.add(new Student(104, "Aman", 85.5, 9876543212L));
        students.add(new Student(102, "Yash", 78.0, 9876543213L));

        System.out.println("Original Student List:");
        System.out.println(students);


        // ==================================================
        // 1. compare() - Using Lambda Expression
        // ==================================================

        Comparator<Student> compareById = (s1, s2) ->
                Integer.compare(s1.id, s2.id);

        Collections.sort(students, compareById);

        System.out.println("\n1. compare() - Sort by ID:");
        System.out.println(students);


        // ==================================================
        // 2. Comparator.comparing()
        // ==================================================

        students.sort(Comparator.comparing(s -> s.name));

        System.out.println("\n2. comparing() - Sort by Name:");
        System.out.println(students);


        // ==================================================
        // 3. Comparator.comparingInt()
        // ==================================================

        students.sort(Comparator.comparingInt(s -> s.id));

        System.out.println("\n3. comparingInt() - Sort by ID:");
        System.out.println(students);


        // ==================================================
        // 4. Comparator.comparingDouble()
        // ==================================================

        students.sort(Comparator.comparingDouble(s -> s.marks));

        System.out.println("\n4. comparingDouble() - Sort by Marks:");
        System.out.println(students);


        // ==================================================
        // 5. Comparator.comparingLong()
        // ==================================================

        students.sort(
                Comparator.comparingLong(s -> s.mobileNumber)
        );

        System.out.println("\n5. comparingLong() - Sort by Mobile:");
        System.out.println(students);


        // ==================================================
        // 6. reversed() - Descending Order
        // ==================================================

        students.sort(
                Comparator.comparingInt((Student s) -> s.id).reversed()
        );

        System.out.println("\n6. reversed() - ID Descending:");
        System.out.println(students);


        // ==================================================
        // 7. thenComparing() - Multiple Field Sorting
        // ==================================================

        Comparator<Student> sortByMarksThenName =
                Comparator.comparingDouble((Student s) -> s.marks)
                        .thenComparing(s -> s.name);

        students.sort(sortByMarksThenName);

        System.out.println("\n7. thenComparing() - Marks, then Name:");
        System.out.println(students);


        // ==================================================
        // 8. thenComparingInt()
        // ==================================================

        Comparator<Student> sortByNameThenId =
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingInt(s -> s.id);

        students.sort(sortByNameThenId);

        System.out.println("\n8. thenComparingInt() - Name, then ID:");
        System.out.println(students);


        // ==================================================
        // 9. thenComparingDouble()
        // ==================================================

        Comparator<Student> sortByNameThenMarks =
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingDouble(s -> s.marks);

        students.sort(sortByNameThenMarks);

        System.out.println("\n9. thenComparingDouble() - Name, then Marks:");
        System.out.println(students);


        // ==================================================
        // 10. thenComparingLong()
        // ==================================================

        Comparator<Student> sortByNameThenMobile =
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingLong(s -> s.mobileNumber);

        students.sort(sortByNameThenMobile);

        System.out.println("\n10. thenComparingLong() - Name, then Mobile:");
        System.out.println(students);


        // ==================================================
        // 11. naturalOrder()
        // ==================================================

        ArrayList<Integer> numbers =
                new ArrayList<>(List.of(40, 10, 30, 20));

        numbers.sort(Comparator.naturalOrder());

        System.out.println("\n11. naturalOrder():");
        System.out.println(numbers);


        // ==================================================
        // 12. reverseOrder()
        // ==================================================

        numbers.sort(Comparator.reverseOrder());

        System.out.println("\n12. reverseOrder():");
        System.out.println(numbers);


        // ==================================================
        // 13. nullsFirst()
        // ==================================================

        ArrayList<String> names = new ArrayList<>();

        names.add("Yash");
        names.add(null);
        names.add("Indu");
        names.add("Aman");

        names.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

        System.out.println("\n13. nullsFirst():");
        System.out.println(names);


        // ==================================================
        // 14. nullsLast()
        // ==================================================

        names.sort(Comparator.nullsLast(Comparator.naturalOrder()));

        System.out.println("\n14. nullsLast():");
        System.out.println(names);


        // ==================================================
        // 15. nullsFirst() - Custom Object Sorting
        // ==================================================

        ArrayList<Student> studentsWithNull = new ArrayList<>();

        studentsWithNull.add(new Student(103, "Yuvraj", 85.5, 9876543210L));
        studentsWithNull.add(null);
        studentsWithNull.add(new Student(101, "Indu", 92.5, 9876543211L));
        studentsWithNull.add(new Student(102, "Yash", 78.0, 9876543213L));

        studentsWithNull.sort(
                Comparator.nullsFirst(
                        Comparator.comparing(s -> s.name)
                )
        );

        System.out.println("\n15. nullsFirst() - Student Objects:");
        System.out.println(studentsWithNull);


        // ==================================================
        // 16. Collections.sort()
        // ==================================================

        Collections.sort(
                students,
                Comparator.comparingInt(s -> s.id)
        );

        System.out.println("\n16. Collections.sort():");
        System.out.println(students);


        // ==================================================
        // 17. List.sort()
        // ==================================================

        students.sort(
                Comparator.comparingDouble((Student s) -> s.marks).reversed()
        );

        System.out.println("\n17. List.sort() - Marks Descending:");
        System.out.println(students);
    }
}