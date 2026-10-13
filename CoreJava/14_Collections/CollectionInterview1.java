/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview1
 * Author : Indu Sahu
 * Purpose: Count the frequency of elements using HashMap.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionInterview1 {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 10);

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            frequency.put(
                    number,
                    frequency.getOrDefault(number, 0) + 1
            );
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Frequency: " + frequency);
    }
}