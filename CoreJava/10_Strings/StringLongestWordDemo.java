public class StringLongestWordDemo {
    public static void main(String [] args) {

        System.out.println("\n========= FIND THE LONGEST WORD IN A STRING ==========\n");

        String text = "Java Backend Development";

        String[] words = text.split(" ");

        String longestWord = "";

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Original: " + text);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}