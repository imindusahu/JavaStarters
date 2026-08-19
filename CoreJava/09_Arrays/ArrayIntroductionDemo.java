/*
 * Topic  : Arrays
 * Program: Array Introduction
 * Author : Indu Sahu
 * Purpose: Demonstrate the concept and advantages of arrays in Java.
 */

public class ArrayIntroductionDemo {
    public static void main(String [] args) {
        printArrayIntroduction();
    }

    private static void printArrayIntroduction() {
        System.out.println("\n=========== ARRAY INTRODUCTION ============\n\n");
        System.out.println("An array is a collection of elements of the same data type stored in contiguous memory locations and accessed using an index.\nIt is a fixed-size data structure that stores elements of the same data type in contiguous memory locations.\nEach element is accessed using its index, which starts from 0 in Java.\n\nKey Points to Remember:\n - Stores multiple values in one variable.\n - All elements must be of the same data type.\n - Elements are accessed using an index.\n - Index starts from 0 in Java.\n - Arrays have a fixed size after creation.\n - Elements are stored in contiguous memory locations, making access fast.\n\nReal-Life Example:\n\nWithout an array:\n  int marks1 = 85;\n  int marks2 = 90;\n  int marks3 = 78;\n  int marks4 = 95;\n  int marks5 = 88;\n\nWith an array:\n  int[] marks = {85, 90, 78, 95, 88};\n");
    }
}