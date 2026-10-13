/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview2
 * Author : Indu Sahu
 * Purpose: Remove duplicate elements while preserving
 *          insertion order using LinkedHashSet.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionInterview2 {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 30);

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        List<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println("Original List: " + numbers);
        System.out.println("After Removing Duplicates: " + result);
    }
}