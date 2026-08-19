/*
 * Topic  : Arrays
 * Program: Array Intersection
 * Author : Indu Sahu
 * Purpose: To find the intersection of two arrays in Java.
 */

public class IntersectionArraysDemo {
    public static void main(String [] args) {
        findIntersection();
    }

    private static void findIntersection() {
        int[] numbers1 = {10, 20, 20, 30, 40};
        int[] numbers2 = {20, 20, 40, 50};

        System.out.println("\n========= ARRAY INTERSECTION ===========\n");

        int[] intersection = new int[Math.min(numbers1.length, numbers2.length)];
        boolean[] used = new boolean[numbers2.length];

        int index = 0;
        for(int i = 0; i < numbers1.length; i++) {
            for(int j = 0; j < numbers2.length; j++) {
                if(numbers1[i] == numbers2[j] && !used[j]) {
                    intersection[index] = numbers1[i];
                    index++;
                    break;
                }
            }
        }
        System.out.println("Intersection: ");

        for(int i = 0; i < index; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println();
    }
}