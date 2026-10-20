import java.util.*;

public class GenericCollectionTasks {
    public static void main(String[] args) {
        
        // ==========================================
        // Task 1 — List
        // ==========================================
        System.out.println("--- Task 1: List ---");
        List<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "TypeScript", "Go"));
        for (String lang : languages) {
            System.out.println(lang);
        }

        // ==========================================
        // Task 2 — Set
        // ==========================================
        System.out.println("\n--- Task 2: Set ---");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate, will be ignored
        numbers.add(30);
        numbers.add(20); // Duplicate, will be ignored
        
        System.out.println("Set elements: " + numbers);
        System.out.println("Set size: " + numbers.size());

        // ==========================================
        // Task 3 — Map
        // ==========================================
        System.out.println("\n--- Task 3: Map ---");
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Advik", 92);
        studentMarks.put("Indu", 85);
        studentMarks.put("Yash", 78);

        String targetStudent = "Indu";
        System.out.println(targetStudent + "'s marks: " + studentMarks.get(targetStudent));

        // ==========================================
        // Task 4 — Generic Method Testing
        // ==========================================
        System.out.println("\n--- Task 4: Generic Method ---");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.print("Printing String List: ");
        printElements(languages);
        
        System.out.print("Printing Integer List: ");
        printElements(intList);
    }

    // Task 4 — Generic method definition
    public static <T> void printElements(List<T> items) {
        System.out.println(items);
    }
}
