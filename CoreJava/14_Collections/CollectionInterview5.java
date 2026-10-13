
/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview5
 * Author : Indu Sahu
 * Purpose: Find the first non-repeated character
 *          using LinkedHashMap.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionInterview5 {

    public static void main(String[] args) {

        String input = "swiss";

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        // Count each character while preserving insertion order
        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Input: " + input);
        System.out.println("Character frequencies: " + frequency);

        // Find the first character whose frequency is 1
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: "
                        + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
