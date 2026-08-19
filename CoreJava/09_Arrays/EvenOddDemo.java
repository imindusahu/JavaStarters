/*
 * Topic  : Arrays
 * Program: Even-Odd Counter
 * Author : Indu Sahu
 * Purpose: Count the total number of even and odd elements of an array in Java.
 */

public class EvenOddDemo {
    public static void main(String [] args) {
        countEvenOddElement();
        separateEvenOddElements();
    }

    private static void countEvenOddElement() {

        System.out.println("\n========== COUNT EVEN AND ODD ELEMENT ==========\n");

        int[] numbers = {10, 15, 20, 25, 30, 35, 40};

        int evenCount = 0;
        int oddCount = 0;
        for(int number : numbers) {
            if(number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Numbers : " + evenCount);
        System.out.println("Odd Numbers : " + oddCount);
    }

    private static void separateEvenOddElements() {

        System.out.println("\n========== SEPARATE EVEN AND ODD ELEMENTS ==========\n");

        int[] numbers = {10, 21, 30, 45, 50, 63, 70};

        int left = 0;
        int right = numbers.length - 1;

        System.out.println("Original Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        while(left < right) {
            while(left < right && numbers[left] % 2 == 0) {
                left++;
            }

            while(left < right && numbers[right] % 2 != 0) {
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