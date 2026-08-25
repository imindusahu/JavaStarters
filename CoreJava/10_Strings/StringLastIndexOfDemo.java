public class StringLastIndexOfDemo {

    public static void main(String[] args) {

        // lastIndexOf() is similar to indexOf(), but it returns the last occurrence of a character or substring.

        String text = "Java Backend Java Developer";

        //  indexOf() → first occurrence and lastIndexOf() → last occurrence
        System.out.println("First index of Java: " + text.indexOf("Java")); // 0
        System.out.println("Last index of Java: " + text.lastIndexOf("Java"));  // 13

        System.out.println("First index of a: " + text.indexOf('a')); // 1
        System.out.println("Last index of a: " + text.lastIndexOf('a'));  // 16

        System.out.println("Last index of Python: " + text.lastIndexOf("Python"));  // -1
    }
}