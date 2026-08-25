public class StringIndexOfDemo {

    public static void main(String[] args) {

        // indexOf() is useful when you want to find the position of a character or substring.

        String text = "Java Backend Developer";

        // If the character/substring exists: indexOf() → position
        System.out.println("Index of J: " + text.indexOf('J'));  // 0
        System.out.println("Index of B: " + text.indexOf('B'));  // 5
        System.out.println("Index of Java: " + text.indexOf("Java"));  // 0
        System.out.println("Index of Backend: " + text.indexOf("Backend"));  // 5

        // If it doesn't exist: indexOf() → -1
        System.out.println("Index of Python: " + text.indexOf("Python"));  // -1
    }
}