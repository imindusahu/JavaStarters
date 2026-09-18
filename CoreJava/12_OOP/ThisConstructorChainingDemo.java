public class ThisConstructorChainingDemo {

    public static void main(String[] args) {

        System.out.println("========= THIS CONSTRUCTOR CHAINING =========");

        Student student1 = new Student();
        Student student2 = new Student("Indu");
        Student student3 = new Student("Yash", 23);
        Student student4 = new Student("Yuvraj", 24, 8.3);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
    }
}


class Student {

    String name;
    int age;
    double cgpa;


    // Constructor 1
    Student() {

        // Calls Constructor 4
        this("Unknown", 0, 0.0);
    }


    // Constructor 2
    Student(String name) {

        // Calls Constructor 4
        this(name, 0, 0.0);
    }


    // Constructor 3
    Student(String name, int age) {

        // Calls Constructor 4
        this(name, age, 0.0);
    }


    // Constructor 4
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