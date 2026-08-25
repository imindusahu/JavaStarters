public class StringContainsDemo {

    public static void main(String[] args) {

        String text = "Java Backend Developer";

        // contains() is case-sensitive.

        System.out.println("Contains Java: " + text.contains("Java"));       // true
        System.out.println("Contains Backend: " + text.contains("Backend"));   // true
        System.out.println("Contains Developer: " + text.contains("Developer"));  // true
        System.out.println("Contains Python: " + text.contains("Python"));    // false
    }
}