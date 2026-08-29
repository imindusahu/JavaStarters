public class MethodParameterDemo {

    // Method with two integer parameters
    static void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }

    // Method with one String parameter
    static void greet(String name) {

        System.out.println("Hello " + name);
    }

    // Method with multiple parameters
    static void displayStudent(String name, int age, double cgpa) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {

        System.out.println("========= ADD METHOD =========");

        add(10, 20);
        add(100, 200);


        System.out.println("\n========= GREET METHOD =========");

        greet("Indu");
        greet("Java Developer");


        System.out.println("\n========= STUDENT DETAILS =========");

        displayStudent("Indu", 22, 7.0);
    }
}