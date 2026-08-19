/*
 * Topic  : Arrays
 * Program: Array Palindrome
 * Author : Indu Sahu
 * Purpose: Check if an array is a Palindrome in Java.
 * Algorithm: Two-Pointer Technique
 */

public class ArrayPalindromeDemo {
    public static void main(String [] args) {
        checkPalindromeArray();
    }

    private static void checkPalindromeArray() {
        int[] numbers = {1, 2, 3, 2, 1};

        System.out.println("\n========== ARRAY PALINDROME ==========\n");

        int left = 0;
        int right = numbers.length - 1;

        boolean isPalindrome = true;

        System.out.println("Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        while(left < right) {
           if(numbers[left] != numbers[right]){
            isPalindrome = false;
            break;
           }
            left++;
            right--;
        }
        if(isPalindrome) {
            System.out.println("\n\nArray is Palindrome.");
        } else {
            System.out.println("\n\nArray is not Palindrome.");
        }
    }
}