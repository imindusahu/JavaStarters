public class RecursionReverseNumberDemo {

    // Recursive method to reverse a number
    static int reverseNumber(int number, int reverse) {

        // Base case
        if (number == 0) {
            return reverse;
        }

        // Get last digit
        int lastDigit = number % 10;

        // Add last digit to reversed number
        reverse = reverse * 10 + lastDigit;

        // Recursive call
        return reverseNumber(number / 10, reverse);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE REVERSE NUMBER =========");

        int number = 1234;

        int result = reverseNumber(number, 0);

        System.out.println("Original: " + number);
        System.out.println("Reversed: " + result);
    }
}