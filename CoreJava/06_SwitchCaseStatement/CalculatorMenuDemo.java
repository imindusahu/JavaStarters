import java.util.Scanner;

public class CalculatorMenuDemo {

    public static void main(String [] args) {

        showsCalculatorMenu();
    }

    private static void showsCalculatorMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========= CALCULATOR ==========\n");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition Selected");
                break;
            case 2:
                System.out.println("Subtraction Selected");
                break;
            case 3:
                System.out.println("Multiplication Selected");
                break;
            case 4:
                System.out.println("Division Selected");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        scanner.close();

    }
}