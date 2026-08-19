/*
 * Topic  : Arrays
 * Program: Positive-Negative-Zero Counter
 * Author : Indu Sahu
 * Purpose: Count the total number of positive, negative and zero elements of an array in Java.
 */

public class PositiveNegativeDemo {
    public static void main(String [] args) {
        countPositiveNegativeZero();
        rearrangePositiveNegative();
    }

    private static void countPositiveNegativeZero() {
        
        int[] numbers = {-10, 15, 0, -25, 30, 35, -40};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for(int number : numbers) {
            if(number > 0) {
                positiveCount++;
            } else if(number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("\n========== COUNT POSITIVE, NEGATIVE AND ZERO ==========\n");

        System.out.println("Positive Numbers : " + positiveCount);
        System.out.println("Negative Numbers : " + negativeCount);
        System.out.println("Zero : " + zeroCount);
    }

    private static void rearrangePositiveNegative() {

        System.out.println("\n========== REARRANGE POSITIVE AND NEGATIVE ==========\n");

        int[] numbers = {10, -20, 30, -40, 50, -60};

        System.out.println("Original Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            while(left < right && numbers[left] > 0) {
                left++;
            }

            while(left < right && numbers[right] < 0) {
                right--;
            }

            if(left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("\n\nArray After Rearrangement: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
