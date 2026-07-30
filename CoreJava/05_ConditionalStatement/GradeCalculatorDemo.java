import java.util.Scanner;

public class GradeCalculatorDemo {

    public static void main(String [] args) {
        toCheckStudentGrade();
    }

    // Using else-if ladder
    private static void toCheckStudentGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = scanner.nextInt();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
        } else if(marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if(marks >= 80 && marks <= 89) {
            System.out.println("Grade B");
        } else if(marks >= 70 && marks <= 79) {
            System.out.println("Grade C");
        } else if(marks >= 60 && marks <= 69) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Thank you for using the application.");

        scanner.close();
    }
}