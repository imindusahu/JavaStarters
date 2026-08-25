public class StringPangramDemo {
    public static void main(String [] args) {

        System.out.println("\n========= CHECK STRING PANGRAM ==========\n");

        String text = "The quick brown fox jumps over the lazy dog";

        boolean[] alphabet = new boolean[26];

        text = text.toLowerCase();

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alphabet[index] = true;
            }
        }

        boolean isPangram = true;
        for(int i = 0; i < alphabet.length; i++) {
            if(!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        System.out.println("Original: " + text);
        System.out.println("Pangram: " + isPangram);
    }
}