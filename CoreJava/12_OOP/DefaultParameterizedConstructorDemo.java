public class DefaultParameterizedConstructorDemo {

    public static void main(String[] args) {

        System.out.println("========= CONSTRUCTORS =========");

        // Calling no-argument constructor
        Student student1 = new Student();

        student1.displayDetails();


        // Calling parameterized constructor
        Student student2 = new Student("Indu", 22, 7.1);

        student2.displayDetails();
    }
}


class Student {

    String name;
    int age;
    double cgpa;


    // No-argument constructor
    Student() {

        name = "Unknown";
        age = 0;
        cgpa = 0.0;
    }


    // Parameterized constructor
    Student(String name, int age, double cgpa) {

        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }


    void displayDetails() {

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}