import java.util.Scanner;

public class UnlockPasswordIfDemo {

    public static void main(String [] args) {
        toCrackPassword();
    }
    // Using if condition
    private static void toCrackPassword() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Password : ");
        String password = scanner.nextLine();

        if("Indu@123".equals(password)) {
            System.out.println("Login Successful!");
        }

        System.out.println("Thank you for using the application.");

        scanner.close();
    }
}