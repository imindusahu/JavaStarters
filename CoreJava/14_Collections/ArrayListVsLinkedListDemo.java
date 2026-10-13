/*
 * Topic  : Collections - ArrayList vs LinkedList
 * Program: ArrayListVsLinkedListDemo
 * Author : Indu Sahu
 * Purpose: Compare common operations of ArrayList and LinkedList.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedListDemo {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Create LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to both lists
        arrayList.add("Indu");
        arrayList.add("Yash");
        arrayList.add("Yuvraj");

        linkedList.add("Indu");
        linkedList.add("Yash");
        linkedList.add("Yuvraj");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Add at the beginning
        arrayList.add(0, "Samarth");
        linkedList.addFirst("Samarth");

        System.out.println("\nAfter adding at beginning:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Add at the end
        arrayList.add("Rahul");
        linkedList.addLast("Rahul");

        System.out.println("\nAfter adding at end:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Access using index
        System.out.println("\nElement at index 2:");
        System.out.println("ArrayList: " + arrayList.get(2));
        System.out.println("LinkedList: " + linkedList.get(2));

        // Remove first element
        arrayList.remove(0);
        linkedList.removeFirst();

        System.out.println("\nAfter removing first element:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Remove last element
        arrayList.remove(arrayList.size() - 1);
        linkedList.removeLast();

        System.out.println("\nAfter removing last element:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Display size
        System.out.println("\nSize:");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());
    }
}