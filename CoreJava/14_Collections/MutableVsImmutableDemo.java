/*
 * Topic  : Collections - Mutable vs Immutable
 * Program: MutableVsImmutableDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate the difference between
 *          mutable and unmodifiable collections.
 */

import java.util.ArrayList;
import java.util.List;

public class MutableVsImmutableDemo {

    public static void main(String[] args) {

        // 1. Mutable List
        List<String> mutableNames = new ArrayList<>();

        mutableNames.add("Indu");
        mutableNames.add("Yash");
        mutableNames.add("Yuvraj");

        System.out.println("Mutable List:");
        System.out.println(mutableNames);

        mutableNames.add("Samarth");

        System.out.println("After adding Samarth:");
        System.out.println(mutableNames);

        // 2. Unmodifiable List
        List<String> immutableNames =
                List.of("Indu", "Yash", "Yuvraj");

        System.out.println("\nUnmodifiable List:");
        System.out.println(immutableNames);

        // Uncomment one line at a time to test:
        // immutableNames.add("Samarth");
        // immutableNames.remove("Yash");
        // immutableNames.set(0, "Aman");
    }
}