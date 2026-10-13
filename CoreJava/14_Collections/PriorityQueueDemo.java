/*
 * Topic  : Collections - PriorityQueue
 * Program: PriorityQueueDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate basic PriorityQueue operations
 *          and understand priority-based removal.
 */

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("PriorityQueue: " + pq);

        // 2. peek()
        System.out.println("\n1. peek():");
        System.out.println("Highest priority element: " + pq.peek());

        // 3. poll()
        System.out.println("\n2. poll():");
        System.out.println("Removed: " + pq.poll());

        // 4. Queue after poll
        System.out.println("\n3. After poll():");
        System.out.println(pq);

        // 5. Remove remaining elements by priority
        System.out.println("\n4. Removing elements by priority:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}