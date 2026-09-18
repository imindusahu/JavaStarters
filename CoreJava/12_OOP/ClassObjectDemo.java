public class ClassObjectDemo {

    public static void main(String[] args) {

        System.out.println("\n========= CLASS AND OBJECT =========\n");

        // Creating first Student object
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Assigning values to object
        student1.name = "Indu";
        student1.age = 22;
        student1.cgpa = 7.1;

        student2.name = "Yash";
        student2.age = 23;
        student2.cgpa = 8.2;

        student3.name = "Yuvraj";
        student3.age = 24;
        student3.cgpa = 8.3;

        // Displaying object data
        System.out.println("Student 1");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("CGPA: " + student1.cgpa);

        System.out.println("\nStudent 2");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("CGPA: " + student2.cgpa);

        System.out.println("\nStudent 3");
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
        System.out.println("CGPA: " + student3.cgpa);
    }
}


// Student class
class Student {

    String name;
    int age;
    double cgpa;
}