import java.util.Scanner;

public class ScannerDemo {
    public static void main(String [] args) {

        readStudentDetails();

    }

    private static void readStudentDetails() {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("\nEnter your Name : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter your Age : ");
        int studentAge = scanner.nextInt();

        System.out.println("\n========== Student Details ==========\n");

        System.out.println("Name : " + studentName);
        System.out.println("Age  : " + studentAge);

        scanner.close();
    }
}