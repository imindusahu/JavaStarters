public class StringSubstringDemo {

    // substring(start-inclusive, end-exclusive) rule
    public static void main(String[] args) {

        String text = "JavaBackend";

        // Start from index 4 and go until the end.
        String part1 = text.substring(4);

        // Start at index 0, stop before index 4.
        String part2 = text.substring(0, 4);

        // Start at index 4, stop before index 11.
        String part3 = text.substring(4, 11);

        System.out.println("Original String: " + text);
        System.out.println("substring(4): " + part1);
        System.out.println("substring(0, 4): " + part2);
        System.out.println("substring(4, 11): " + part3);
    }
}