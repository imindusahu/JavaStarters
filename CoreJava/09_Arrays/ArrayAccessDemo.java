/*
 * Topic  : Arrays
 * Program: Array Access
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and access of elements of arrays in Java.
 */

public class ArrayAccessDemo {
    public static void main(String [] args) {
        printArrayAccessElement();
    }

    private static void printArrayAccessElement() {
        System.out.println("\n========== ARRAY ACCESS ===========\n");

        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        System.out.println("First Fruits : " + fruits[0]);
        System.out.println("Last Fruits : " + fruits[fruits.length - 1]);
        System.out.println("\nUpdating Second fruits....\n");

        fruits[1] = "Grapes";

        System.out.println("Updated Second Fruits : " + fruits[1]);


    }
}
