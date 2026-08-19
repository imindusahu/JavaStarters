/*
 * Topic  : Arrays
 * Program: Pair Sum
 * Author : Indu Sahu
 * Purpose: Find the pair with a given sum of an array in Java.
 * | Approach  |      Time    |Extra Space|
| ------------ | ------------ | --------- |
| Nested loops |        O(n²) |      O(1) |
| HashSet      | O(n) average |      O(n) |

 */

import java.util.HashSet;

public class PairSumDemo {
    public static void main(String [] args) {
        findPairSum();
        findTwoSumOptimized();
    }

    private static void findPairSum() {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 70;

        System.out.println("\n========= PAIR WITH GIVEN SUM =========\n");

        System.out.println("Target : " + target);
        System.out.println();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    System.out.println("Pair Found : " + numbers[i] + " + " + numbers[j] + " = " + target);
                }
            }
        }
    }

    private static void findTwoSumOptimized() {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 70;

        System.out.println("\n\n========= TWO SUM USING HASHSET ==========\n");

        System.out.println("Target : " + target);
        System.out.println();

        HashSet<Integer> seen = new HashSet<>();

        for(int number : numbers) {
            int complement = target - number;

            if(seen.contains(complement)) {
                System.out.println("Pair Found : " + complement + " + " + number + " = " + target);
            }

            seen.add(number);
        }
    }
}