/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview3
 * Author : Indu Sahu
 * Purpose: Find duplicate elements using HashSet.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionInterview3 {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 10);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Original List: " + numbers);
        System.out.println("Duplicate Elements: " + duplicates);
    }
}