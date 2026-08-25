public class StringCaseConversionDemo {

    public static void main(String[] args) {

        // toUpperCase() and toLowerCase(): These methods are useful for case conversion.

        String text = "Java Backend Developer";

        String upperCaseText = text.toUpperCase();
        String lowerCaseText = text.toLowerCase();

        System.out.println("Original String: " + text);  // Original String: Java Backend Developer
        System.out.println("Uppercase: " + upperCaseText);  // Uppercase: JAVA BACKEND DEVELOPER
        System.out.println("Lowercase: " + lowerCaseText);  // Lowercase: java backend developer

        System.out.println("Original after conversion: " + text);  // Original after conversion: Java Backend Developer
    }
}