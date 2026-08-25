public class StringTrimDemo {

    public static void main(String[] args) {

        // trim() removes whitespace from the beginning and end of the String.
        // It does not remove spaces between words.

        String text = "   Java Backend Developer   ";

        System.out.println("Original: [" + text + "]");  // Original: [   Java Backend Developer   ]
        System.out.println("Trimmed: [" + text.trim() + "]");   // Trimmed: [Java Backend Developer]

        String name = "   Indu Sahu   ";

        System.out.println("Name: [" + name.trim() + "]");  // Name: [Indu Sahu]
    }
}