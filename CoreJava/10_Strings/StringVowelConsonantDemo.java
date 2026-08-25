public class StringVowelConsonantDemo {
    public static void main(String [] args) {

        String text = "Java 123";

        System.out.println("String: " + text);

        text = text.toLowerCase();

        int countVowels = 0;
        int countConsonants = 0;

        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }
        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);
    }
}