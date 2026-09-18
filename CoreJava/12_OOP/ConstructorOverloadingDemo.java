public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        System.out.println("========= CONSTRUCTOR OVERLOADING =========");

        // Constructor 1: No arguments
        Student student1 = new Student();

        // Constructor 2: Name only
        Student student2 = new Student("Indu");

        // Constructor 3: Name and age
        Student student3 = new Student("Yash", 23);

        // Constructor 4: Name, age and CGPA
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

        name = "Unknown";
        age = 0;
        cgpa = 0.0;
    }


    // Constructor 2
    Student(String name) {

        this.name = name;
        age = 0;
        cgpa = 0.0;
    }


    // Constructor 3
    Student(String name, int age) {

        this.name = name;
        this.age = age;
        cgpa = 0.0;
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