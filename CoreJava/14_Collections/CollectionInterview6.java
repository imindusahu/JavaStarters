
/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview6
 * Author : Indu Sahu
 * Purpose: Find the K largest elements using PriorityQueue.
 * Time complexity: (O(nlog k)).
 * Extra space: O(k))
 */

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class CollectionInterview6 {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 5, 20, 8, 15, 30);

        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int number : numbers) {
            minHeap.offer(number);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("K: " + k);
        System.out.println("Top " + k + " largest elements:");

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
