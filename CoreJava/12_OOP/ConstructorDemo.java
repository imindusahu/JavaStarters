public class ConstructorDemo {

    public static void main(String[] args) {

        System.out.println("========= CONSTRUCTOR =========");

        // Constructor is automatically called here
        Student student1 = new Student("Indu", 22, 7.1);

        Student student2 = new Student("Yash", 23, 8.2);

        Student student3 = new Student("Yuvraj", 24, 8.3);


        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}


class Student {

    String name;
    int age;
    double cgpa;


    // Constructor
    Student(String name, int age, double cgpa) {

        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }


    // Instance method
    void displayDetails() {

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}