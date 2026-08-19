/*
 * Topic  : Arrays
 * Program: Majority Element
 * Author : Indu Sahu
 * Purpose: Find the majority element using Boyer-Moore Voting Algorithm in Java.
 * Algorithm: Boyer-Moore Voting Algorithm
 */

public class MajorityElementDemo {
    public static void main(String [] args) {
        findMajorityElement();
        findMajorityElementUsingBoyerMoore();
    }

    // Simple frequency-counting approach: Time: O(n²) and Space: O(1)
    private static void findMajorityElement() {

        System.out.println("\n========== MAJORITY ELEMENT USING FREQUENCY-COUNTING APPROACH ==========\n");

        int[] numbers = {2, 2, 1, 1, 1, 2, 2};
        int mostFrequent = numbers[0];
        int maxFrequency = Integer.MIN_VALUE;
        boolean[] visited = new boolean[numbers.length];

        System.out.println("Array: ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }

        for(int i = 0; i < numbers.length; i++) {
            if(visited[i]) {
                continue;
            }

            int frequency = 1;

            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }

            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequent = numbers[i];
            }
        }
        System.out.println("\n\nMajority Element : " + mostFrequent);
        System.out.println("Frequency : " + maxFrequency);
    }

    // Boyer–Moore Voting Algorithm: Time: O(n) and Space: O(1)
    private static void findMajorityElementUsingBoyerMoore() {

        int[] numbers = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("\n========== MAJORITY ELEMENT BOYER-MOORE VOTING ALGORITHM ==========\n");

        System.out.println("Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int number : numbers) {

            if (count == 0) {
                candidate = number;
            }

            if (number == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        int frequency = 0;

        for (int number : numbers) {
            if (number == candidate) {
                frequency++;
            }
        }

        System.out.println("\n\nCandidate : " + candidate);
        System.out.println("Frequency : " + frequency);

        if (frequency > numbers.length / 2) {
            System.out.println("Majority Element : " + candidate);
        } else {
            System.out.println("No majority element.");
        }
    }
}