/*
 * Topic  : Collections - Deque
 * Program: DequeDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate adding, removing, and
 *          examining elements from both ends of a Deque.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // 1. addFirst()
        deque.addFirst("Yash");
        deque.addFirst("Indu");

        System.out.println("1. After addFirst():");
        System.out.println(deque);

        // 2. addLast()
        deque.addLast("Aman");
        deque.addLast("Yuvraj");

        System.out.println("\n2. After addLast():");
        System.out.println(deque);

        // 3. peekFirst()
        System.out.println("\n3. peekFirst():");
        System.out.println("First: " + deque.peekFirst());

        // 4. peekLast()
        System.out.println("\n4. peekLast():");
        System.out.println("Last: " + deque.peekLast());

        // 5. removeFirst()
        String first = deque.removeFirst();

        System.out.println("\n5. removeFirst():");
        System.out.println("Removed: " + first);
        System.out.println("Deque: " + deque);

        // 6. removeLast()
        String last = deque.removeLast();

        System.out.println("\n6. removeLast():");
        System.out.println("Removed: " + last);
        System.out.println("Deque: " + deque);

        // 7. offerFirst()
        deque.offerFirst("Samarth");

        // 8. offerLast()
        deque.offerLast("Rohan");

        System.out.println("\n7. After offerFirst() and offerLast():");
        System.out.println(deque);

        // 9. pollFirst()
        String firstPoll = deque.pollFirst();

        System.out.println("\n8. pollFirst():");
        System.out.println("Removed: " + firstPoll);
        System.out.println("Deque: " + deque);

        // 10. pollLast()
        String lastPoll = deque.pollLast();

        System.out.println("\n9. pollLast():");
        System.out.println("Removed: " + lastPoll);
        System.out.println("Deque: " + deque);

        // 11. Queue behavior
        deque.addLast("Queue-1");
        deque.addLast("Queue-2");

        System.out.println("\n10. Queue behavior:");
        System.out.println("Before: " + deque);
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("After: " + deque);

        // 12. Stack behavior
        deque.push("Stack-1");
        deque.push("Stack-2");

        System.out.println("\n11. Stack behavior:");
        System.out.println("Before pop(): " + deque);
        System.out.println("Popped: " + deque.pop());
        System.out.println("After pop(): " + deque);
    }
}