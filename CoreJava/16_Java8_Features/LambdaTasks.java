import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTasks {
    public static void main(String[] args) {
        
        // ==========================================
        // Task 1 — No parameter
        // ==========================================
        Runnable task1 = () -> System.out.println("Welcome to Java 8 Features");
        
        System.out.println("--- Task 1 Output ---");
        task1.run();
        System.out.println();


        // ==========================================
        // Task 2 — One parameter
        // ==========================================
        // Uses the built-in Consumer functional interface
        java.util.function.Consumer<String> task2 = name -> System.out.println("Welcome, " + name);
        
        System.out.println("--- Task 2 Output ---");
        task2.accept("Alice");
        System.out.println();


        // ==========================================
        // Task 3 — Multiple parameters
        // ==========================================
        // Uses the built-in BinaryOperator functional interface
        java.util.function.BinaryOperator<Integer> multiply = (a, b) -> a * b;
        
        System.out.println("--- Task 3 Output ---");
        int result = multiply.apply(6, 7);
        System.out.println("Multiplication Result: " + result);
        System.out.println();


        // ==========================================
        // Task 4 — Sorting
        // ==========================================
        List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 5, 89, 12, 43));
        
        System.out.println("--- Task 4 Output ---");
        System.out.println("Original list: " + numbers);
        
        // Sorts descending using a lambda expression for the Comparator
        numbers.sort((a, b) -> b.compareTo(a));
        
        System.out.println("Sorted (Descending): " + numbers);
    }
}
