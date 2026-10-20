import java.util.ArrayList;
import java.util.List;

class Student {
    private final String name;
    private final int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class GenericsWithCustomObjectsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Indu", 92));
        students.add(new Student("Rahul", 85));
        students.add(new Student("Priya", 95));

        for (Student student : students) {
            System.out.println(
                student.getName() + ": " + student.getMarks()
            );
        }
    }
}