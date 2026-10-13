/*
 * Topic  : Collections - Empty Queue Behavior
 * Program: EmptyQueueDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate the behavior of Queue methods
 *          when the queue is empty.
 */

import java.util.LinkedList;
import java.util.Queue;

public class EmptyQueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        System.out.println("Is queue empty? " + queue.isEmpty());

        // 1. poll()
        String pollResult = queue.poll();

        System.out.println("\n1. poll():");
        System.out.println("Result: " + pollResult);

        // 2. peek()
        String peekResult = queue.peek();

        System.out.println("\n2. peek():");
        System.out.println("Result: " + peekResult);

        // 3. remove()
        System.out.println("\n3. remove():");

        try {
            String removeResult = queue.remove();
            System.out.println("Result: " + removeResult);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }

        // 4. element()
        System.out.println("\n4. element():");

        try {
            String elementResult = queue.element();
            System.out.println("Result: " + elementResult);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
        }
    }
}