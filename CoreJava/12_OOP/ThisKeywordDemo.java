public class ThisKeywordDemo {

    public static void main(String[] args) {

        System.out.println("========= THIS KEYWORD =========");

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


    Student(String name, int age, double cgpa) {

        // this.name = instance variable
        // name = constructor parameter

        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }


    void displayDetails() {

        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CGPA: " + this.cgpa);
    }
}