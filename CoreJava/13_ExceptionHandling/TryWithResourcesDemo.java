/*
 * Topic  : Exception Handling
 * Program: TryWithResourcesDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate try-with-resources.
 */

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("data.txt")) {

            System.out.println("File opened successfully");

        } catch (IOException e) {

            System.out.println("File could not be opened");
        }

        System.out.println("Program ended");
    }
}