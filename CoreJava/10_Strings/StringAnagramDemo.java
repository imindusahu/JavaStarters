public class StringAnagramDemo {
    public static void main(String [] args) {

        System.out.println("\n========= CHECK ANAGRAM ==========\n");

        String str1 = "listen";
        String str2 = "silent";

        int[] frequency = new int[256];

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        if(str1.length() != str2.length()) {
            System.out.println("Anagram: false");
            return;
        }

        for(int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }
        boolean isAnagram = true;

        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] != 0) {
               isAnagram = false;
               break;
            }
        }
        System.out.println("Anagram: " + isAnagram);
    }
}