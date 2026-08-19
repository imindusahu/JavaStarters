/*
 * Topic  : Arrays
 * Program: Common Elements in Two Array
 * Author : Indu Sahu
 * Purpose: To find common elements in two array in Java.
 */

public class CommonElementsDemo {
    public static void main(String [] args) {
        findCommonElements();
    }

    private static void findCommonElements() {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = {30, 40, 50, 60, 70};

        System.out.println("\n======== FIND COMMON ELEMENTS IN TWO ARRAY =========\n");

        for(int i = 0; i < numbers1.length; i++) {
            for(int j = 0; j < numbers2.length; j++) {
                if(numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i]);
                }
            }
        }
    }
}