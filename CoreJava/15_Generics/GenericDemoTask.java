import java.util.ArrayList;
import java.util.List;

public class GenericDemoTask {

    // ==========================================
    // TASK 1: Generic Interface & Implementation
    // ==========================================
    interface Converter<T> {
        T convert(T value);
    }

    static class UppercaseStringConverter implements Converter<String> {
        @Override
        public String convert(String value) {
            if (value == null) {
                return null;
            }
            return value.toUpperCase();
        }
    }

    // ==========================================
    // TASK 2: Multiple Type Parameters
    // ==========================================
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    // ==========================================
    // TASK 4: Bounded Processor
    // ==========================================
    static class Processor<T extends Number> {
        public T process(T value) {
            // Returns the value back as required by the prompt
            return value;
        }
    }

    // ==========================================
    // Main Method Execution & Demonstration
    // ==========================================
    public static void main(String[] args) {
        
        System.out.println("--- Task 1: Generic Interface ---");
        Converter<String> stringConverter = new UppercaseStringConverter();
        String original = "hello generics";
        String converted = stringConverter.convert(original);
        System.out.println("Original: " + original);
        System.out.println("Converted: " + converted + "\n");


        System.out.println("--- Task 2: Multiple Type Parameters ---");
        Pair<String, Integer> studentRecord = new Pair<>("Alice", 95);
        System.out.println("Student Name (Key): " + studentRecord.getKey());
        System.out.println("Student Marks (Value): " + studentRecord.getValue() + "\n");


        System.out.println("--- Task 3: Invariance Demonstration ---");
        demonstrateInvariance();
        System.out.println();


        System.out.println("--- Task 4: Bounded Processor ---");
        Processor<Integer> intProcessor = new Processor<>();
        Processor<Double> doubleProcessor = new Processor<>();

        Integer intResult = intProcessor.process(42);
        Double doubleResult = doubleProcessor.process(3.14159);

        System.out.println("Processed Integer: " + intResult);
        System.out.println("Processed Double: " + doubleResult);
    }

    // ==========================================
    // TASK 3: Invariance Explanation
    // ==========================================
    private static void demonstrateInvariance() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        /*
         * CRITICAL: The statement below causes a compile-time error.
         * Type mismatch: cannot convert from List<Integer> to List<Number>
         * 
         * Why? Generics in Java are invariant. 
         * Even though Integer IS-A Number, List<Integer> IS NOT a List<Number>.
         */
        // List<Number> numberList = integerList; // <-- Compile-time error if uncommented

        /*
         * Why this safety restriction exists:
         * If the assignment above were allowed, we could then write:
         * 
         * numberList.add(5.5); // 5.5 is a Double, which is a valid Number!
         * 
         * However, numberList still points to the exact same memory area as integerList.
         * This would corrupt integerList by introducing a Double value into a collection 
         * explicitly declared to hold only Integers, causing a ClassCastException later at runtime.
         */
        System.out.println("Invariance prevents Type Safety corruption successfully.");
    }
}
