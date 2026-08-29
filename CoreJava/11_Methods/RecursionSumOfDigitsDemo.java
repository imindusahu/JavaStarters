public class RecursionSumOfDigitsDemo {

    // Recursive method to calculate sum of digits
    static int sumOfDigits(int number) {

        // Base case
        if (number == 0) {
            return 0;
        }

        // Get last digit + solve remaining number
        return (number % 10) + sumOfDigits(number / 10);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE SUM OF DIGITS =========");

        int number = 1234;

        int result = sumOfDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + result);
    }
}