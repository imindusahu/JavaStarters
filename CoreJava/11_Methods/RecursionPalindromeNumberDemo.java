public class RecursionPalindromeNumberDemo {

    // Recursive method to reverse a number
    static int reverseNumber(int number, int reverse) {

        // Base case
        if (number == 0) {
            return reverse;
        }

        // Get last digit
        int lastDigit = number % 10;

        // Build reversed number
        reverse = reverse * 10 + lastDigit;

        // Recursive call
        return reverseNumber(number / 10, reverse);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE PALINDROME NUMBER =========");

        int number = 121;

        int original = number;

        int reversed = reverseNumber(number, 0);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        if (original == reversed) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }
    }
}