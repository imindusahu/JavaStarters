public class StringReverseDemo {

    public static void main(String[] args) {
        reverseString();
        reverseWords();
        reverseEachWords();
    }

    private static void reverseString() {  

        System.out.println("\n========= REVERSE A STRING ==========\n");
            
        String text = "Java";

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }

    private static void reverseWords() {

        System.out.println("\n========= REVERSE WORDS IN A STRING ==========\n");

        String text = "Java Backend Developer";
        String reversedWords = "";

        System.out.println("Original: " + text);
        System.out.print("Reversed Words: ");

        String[] words = text.split(" ");

        for(int i =  words.length - 1; i >= 0; i--) {
           System.out.print(words[i]);

           if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private static void reverseEachWord() {

        System.out.println("\n========= REVERSE EACH WORD IN A STRING ==========\n");

        String text = "Java Backend Developer";

        String[] words = text.split(" ");

        System.out.println("Original: " + text);
        System.out.print("Result: ");

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            for(int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}