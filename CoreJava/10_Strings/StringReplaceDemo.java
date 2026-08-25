public class StringReplaceDemo {

    public static void main(String[] args) {

        // replace() is used to replace characters or character sequences inside a String.
        // Java Strings are immutable.

        String text = "Java Backend Developer";

        String result1 = text.replace("Java", "Python");
        String result2 = text.replace("Backend", "Full Stack");
        String result3 = text.replace('a', 'o');

        System.out.println("Original: " + text);  // Original: Java Backend Developer
        System.out.println("Replace Java: " + result1);   // Replace Java: Python Backend Developer
        System.out.println("Replace Backend: " + result2);  // Replace Backend: Java Full Stack Developer
        System.out.println("Replace character a: " + result3);  // Replace character a: Jovo Bockend Developer
    }
}