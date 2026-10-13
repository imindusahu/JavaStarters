/*
 * Topic  : Collections - TreeSet
 * Program: TreeSetInclusiveDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate inclusive and exclusive TreeSet ranges.
 */

import java.util.TreeSet;

public class TreeSetInclusiveDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original TreeSet: " + numbers);

        // subSet with both boundaries inclusive
        System.out.println(
                "subSet(20, true, 50, true): "
                        + numbers.subSet(20, true, 50, true)
        );

        // subSet with both boundaries exclusive
        System.out.println(
                "subSet(20, false, 50, false): "
                        + numbers.subSet(20, false, 50, false)
        );

        // headSet including 40
        System.out.println(
                "headSet(40, true): "
                        + numbers.headSet(40, true)
        );

        // tailSet excluding 30
        System.out.println(
                "tailSet(30, false): "
                        + numbers.tailSet(30, false)
        );
    }
}