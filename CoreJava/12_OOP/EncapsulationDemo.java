public class EncapsulationDemo {

    public static void main(String[] args) {

        System.out.println("========= ENCAPSULATION =========");

        Student student = new Student();

        // Setting values using setters
        student.setName("Indu");
        student.setAge(22);
        student.setCgpa(50.0);

        // Getting values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("CGPA: " + student.getCgpa());
    }
}


class Student {

    // Private instance variables
    private String name;
    private int age;
    private double cgpa;


    // Setter for name
    public void setName(String name) {
        this.name = name;
    }


    // Getter for name
    public String getName() {
        return name;
    }


    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }


    // Getter for age
    public int getAge() {
        return age;
    }


    // Setter for CGPA
    public void setCgpa(double cgpa) {
        if(cgpa >= 0 && cgpa <=10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value. It should be between 0 and 10.");
        }
    }


    // Getter for CGPA
    public double getCgpa() {
        return cgpa;
    }
}