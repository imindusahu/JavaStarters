import java.util.Scanner;

public class VotingEligibilityIfElseDemo {
    
    public static void main(String [] args) {

        checkVotingEligibility();

    }
    // using if-else condition
    private static void checkVotingEligibility() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        int age = scanner.nextInt();
        
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote.");
        }

        System.out.println("Thank you for using the application.");

        scanner.close();
    }
}