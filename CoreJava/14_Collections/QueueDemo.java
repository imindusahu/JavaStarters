/*
 * Topic  : Collections - Queue
 * Program: QueueDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate Queue operations and
 *          understand FIFO behavior.
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // 1. add()
        queue.add("Indu");
        queue.add("Yash");
        queue.add("Aman");

        System.out.println("Queue after add():");
        System.out.println(queue);

        // 2. offer()
        queue.offer("Yuvraj");

        System.out.println("\nQueue after offer():");
        System.out.println(queue);

        // 3. peek()
        System.out.println("\n3. peek():");
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue after peek(): " + queue);

        // 4. element()
        System.out.println("\n4. element():");
        System.out.println("Front element: " + queue.element());

        // 5. poll()
        String removedElement = queue.poll();

        System.out.println("\n5. poll():");
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after poll(): " + queue);

        // 6. remove()
        String removedElement2 = queue.remove();

        System.out.println("\n6. remove():");
        System.out.println("Removed element: " + removedElement2);
        System.out.println("Queue after remove(): " + queue);

        // 7. contains()
        System.out.println("\n7. contains():");
        System.out.println("Contains Aman? " + queue.contains("Aman"));

        // 8. size()
        System.out.println("\n8. size():");
        System.out.println("Queue size: " + queue.size());

        // 9. isEmpty()
        System.out.println("\n9. isEmpty():");
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 10. Iteration
        System.out.println("\n10. Iterating through Queue:");

        for (String name : queue) {
            System.out.println(name);
        }
    }
}