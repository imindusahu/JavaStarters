/*
 * Topic  : Arrays
 * Program: Peak Element
 * Author : Indu Sahu
 * Purpose: Find the peak element of an array in Java.
 */

public class PeakElementDemo {
    public static void main(String [] args) {
        findPeakElementByLinear();
        findPeakElementByBinary();
    }

    // Time complexity: O(n) and Space complexity: O(1)
    private static void findPeakElementByLinear() {

        int[] numbers = {10, 20, 30, 40, 30, 20, 10};

        System.out.println("\n========= FIND PEAK ELEMENT USING LINEAR SEARCH =========\n");

        System.out.println("Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                System.out.println("\n\nPeak Element : " + numbers[i]);
                System.out.println("Peak Index : " + i);
            }
        }
    }

     // Time complexity: O(log n) and Space complexity: O(1)
    private static void findPeakElementByBinary() {

        int[] numbers = {10, 20, 30, 40, 30, 20, 10};

        System.out.println("\n========= FIND PEAK ELEMENT USING BINARY SEARCH =========\n");

        System.out.println("Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(numbers[mid] < numbers[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int peakIndex = left;
        int peakElement = numbers[peakIndex];

        System.out.println("\n\nPeak Element : " + peakElement);
        System.out.println("Peak Index : " + peakIndex);
    }
}