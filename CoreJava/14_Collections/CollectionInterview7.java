
/*
 * Topic  : Collections - Interview Problem
 * Program: CollectionInterview7
 * Author : Indu Sahu
 * Purpose: Safely remove even numbers using Iterator.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionInterview7 {

    public static void main(String[] args) {

        List<Integer> numbers =
                new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));

        System.out.println("Original List: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("After Removing Even Numbers: " + numbers);
    }
}
