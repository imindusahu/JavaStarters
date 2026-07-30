import java.util.Scanner;

public class StudentInputDemo {

   public static void main(String [] args) {

        readStudentInput();

   }

   private static void readStudentInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Age : ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter Student CGPA : ");
        double studentCgpa = scanner.nextDouble();

        System.out.print("Are you Placed? : ");
        boolean studentIsPlaced = scanner.nextBoolean();

        System.out.println("\n========== STUDENT DETAILS ==========\n");

        System.out.println("Name.     : " + studentName);
        System.out.println("Age       : " + studentAge);
        System.out.println("CGPA      : " + studentCgpa);
        System.out.println("Is Placed : " + studentIsPlaced);

        scanner.close();

   }

}

