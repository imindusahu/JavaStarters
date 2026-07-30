import java.util.Scanner;

public class LoginValidationNestedIfDemo {

    public static void main(String [] args) {
        validateLogin();
    }

    private static void validateLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        System.out.print("Enter your Password : ");
        String password = scanner.nextLine();

        if("admin".equals(username)) {
            if("Indu@123".equals(password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("User Not Found");
        }

        scanner.close();
    }
}