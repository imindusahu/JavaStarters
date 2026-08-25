public class CountLettersDigitsSpecialCharactersDemo {
    public static void main(String [] args) {

        System.out.println("\n========= COUNT LETTERS, DIGITS AND SPECIAL CHARACTERS =========\n");

        String text = "Java123@Backend!";
        int countLetters = 0;
        int countDigits = 0;
        int countSpecials = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                countLetters++;
            } else if(ch >= '0' && ch <= '9') {
                countDigits++;
            } else {
                countSpecials++;
            }
        }
        System.out.println("Original: " + text);
        System.out.println("\nLetters: " + countLetters);
        System.out.println("Digits: " + countDigits);
        System.out.println("Special Characters: " + countSpecials);
    }
}