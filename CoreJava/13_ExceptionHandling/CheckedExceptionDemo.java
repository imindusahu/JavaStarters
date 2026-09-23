/*
 * Topic  : Exception Handling
 * Program: CheckedExceptionDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate a checked exception.
 */

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("data.txt");

            System.out.println("File opened successfully");

            reader.close();

        } catch (IOException e) {

            System.out.println("File could not be opened");
        }

        System.out.println("Program ended");
    }
}