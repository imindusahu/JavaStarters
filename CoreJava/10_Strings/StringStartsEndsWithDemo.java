public class StringStartsEndsWithDemo {

    public static void main(String[] args) {

        // startsWith() and endsWith(): These methods are commonly useful for checking prefixes and suffixes.
        
        String text = "Java Backend Developer";

        System.out.println("Starts with Java: " + text.startsWith("Java"));  // true
        System.out.println("Starts with Backend: " + text.startsWith("Backend"));  // false

        System.out.println("Ends with Developer: " + text.endsWith("Developer")); // true
        System.out.println("Ends with Java: " + text.endsWith("Java"));      // false

        //  Both are case-sensitive.
        System.out.println("Starts with java: " + text.startsWith("java"));   // false
        System.out.println("Ends with developer: " + text.endsWith("developer"));   // false
    }
}