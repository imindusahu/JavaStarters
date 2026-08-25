public class StringRemoveDuplicateDemo {
    public static void main(String [] args) {
        removeDuplicateCharacters();
        removeDuplicateWords();
    }

    private static void removeDuplicateCharacters() {

        System.out.println("\n========= REMOVE DUPLICATE CHARACTERS ==========\n");

        String text = "programming";

        boolean[] visited = new boolean[text.length()];

        System.out.println("Original: " + text);
        System.out.print("After removing duplicates: ");

        for(int i = 0; i < text.length(); i++) {
            if(visited[i]) {
                continue;
            }

            for(int j = 0; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)) {
                    visited[j] = true;
                }
            }
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    private static void removeDuplicateWords() {

        System.out.println("\n\n========= REMOVE DUPLICATE WORDS ==========\n");

        String text = "Java Backend Java Developer Backend";

        boolean[] visited = new boolean[text.length()];

        String[] words = text.split(" ");

        System.out.println("Original: " + text);
        System.out.print("After removing duplicate words: ");

        for(int i = 0; i < words.length; i++) {
            if(visited[i]) {
                continue;
            }

            for(int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    visited[j] = true;
                }
            }
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}