public class StringShortestWordDemo {
    public static void main(String [] args) {

        System.out.println("\n======== FIND THE SHORTEST WORD IN A STRING =========\n");

        String text = "Java Backend Development";

        String[] words = text.split(" ");

        String shortestWord = words[0];

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        System.out.println("Original: " + text);
        System.out.println("Shortest Word: " + shortestWord);
        System.out.println("Length: " + shortestWord.length());
    }
}