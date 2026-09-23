/*
 * Topic  : Exception Handling
 * Program: ReadFileDemo
 * Author : Indu Sahu
 * Purpose: Demonstrate try-with-resources while reading a file.
 */

import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("data.txt")) {

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {

            System.out.println("Error reading file: "
                    + e.getMessage());
        }

        System.out.println("Program ended");
    }
}