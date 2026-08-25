public class StringReplaceFirstDemo {

    public static void main(String[] args) {

        // replaceFirst() replaces only the first matching occurrence.

        String text = "Java Java Java";

        String result = text.replaceFirst("Java", "Python");

        System.out.println("Original: " + text);    //  Original: Java Java Java
        System.out.println("After replaceFirst: " + result);  // After replaceFirst: Python Java Java
    }
}