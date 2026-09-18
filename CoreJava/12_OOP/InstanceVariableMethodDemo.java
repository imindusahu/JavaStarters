public class InstanceVariableMethodDemo {

    public static void main(String[] args) {

        System.out.println("========= INSTANCE VARIABLES AND METHODS =========");

        // Create first object
        Student student1 = new Student();

        student1.name = "Indu";
        student1.age = 22;
        student1.cgpa = 7.1;

        // Create second object
        Student student2 = new Student();

        student2.name = "Yash";
        student2.age = 23;
        student2.cgpa = 8.2;

        // Create third object
        Student student3 = new Student();

        student3.name = "Yuvraj";
        student3.age = 24;
        student3.cgpa = 8.3;


        // Calling instance methods

        student1.introduce();
        student2.introduce();
        student3.introduce();

        // Calling another instance method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();


        // Calling another instance method
        student1.study();
        student2.study();
        student3.study();
    }
}


// Student class
class Student {

    // Instance variables
    String name;
    int age;
    double cgpa;


    // Instance method

    void introduce() {

        System.out.println("Hi, I am " + name + ".");
    }

    //  Another instance method
    void displayDetails() {

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }

    // Another instance method
    void study() {

        System.out.println(name + " is studying Java.");
    }
}