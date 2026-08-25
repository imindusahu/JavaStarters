public class StringFirstNonRepeatingCharacterDemo {
    public static void main(String [] args) {

        System.out.println("\n=========== FIRST NON-REPEATING CHARACTER ============\n");
        String text = "programming";

        System.out.println("Original: " + text);

        for(int i = 0; i < text.length(); i++) {
            int frequency = 0;

            for(int j = i + 1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)) {
                    frequency++;
                }
            }
            if(frequency == 0) {
                System.out.println("First non-repeating character: " + text.charAt(i));
                break;  
            }
        } 
    }
}