/*
 * Topic  : Collections - PriorityQueue Max-Heap
 * Program: PriorityQueueMaxHeapDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate a PriorityQueue that removes
 *          the largest element first.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeapDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Max-Heap PriorityQueue:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}