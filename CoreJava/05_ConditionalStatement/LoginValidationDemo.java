import java.util.Scanner;

public class LoginValidationDemo {

    public static void main(String [] args) {
        checkValidUsernamePassword();
    }
    
    // Using if-else condition
    private static void checkValidUsernamePassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        System.out.print("Enter Your Password : ");
        String password = scanner.nextLine();

        if("admin".equals(username) && "Indu@123".equals(password)) {
            System.out.println("Login Successful!");
        }else {
            System.out.println("Invalid username or Password.");
        }

        scanner.close();
    }
}