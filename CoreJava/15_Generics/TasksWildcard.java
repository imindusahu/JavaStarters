import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasksWildcard {

    // 1. Prints items of any type using an unbounded wildcard (?)
    public static void printItems(List<?> items) {
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 2. Finds the maximum value using an upper-bounded wildcard (? extends Number)
    public static double findMaximum(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty or null");
        }
        
        double max = numbers.get(0).doubleValue();
        for (Number num : numbers) {
            if (num.doubleValue() > max) {
                max = num.doubleValue();
            }
        }
        return max;
    }

    // 3. Adds five integers using a lower-bounded wildcard (? super Integer)
    public static void addDefaults(List<? super Integer> values) {
        if (values == null) return;
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
    }

    public static void main(String[] args) {
        // --- Testing printItems ---
        System.out.println("--- Testing printItems ---");
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        
        printItems(stringList);
        printItems(intList);

        // --- Testing findMaximum ---
        System.out.println("\n--- Testing findMaximum ---");
        List<Double> doubleList = Arrays.asList(1.5, 4.2, 3.8, 9.1);
        System.out.println("Max of Integers: " + findMaximum(intList));
        System.out.println("Max of Doubles: " + findMaximum(doubleList));
        
        // Testing empty list handling
        try {
            findMaximum(new ArrayList<Integer>());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception for empty list: " + e.getMessage());
        }

        // --- Testing addDefaults ---
        System.out.println("\n--- Testing addDefaults ---");
        List<Number> numberList = new ArrayList<>(); // Number is a supertype of Integer
        addDefaults(numberList);
        System.out.println("Number list after additions: " + numberList);
    }
}
