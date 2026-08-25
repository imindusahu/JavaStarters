public class StringFirstRepeatingCharacterDemo {
    public static void main(String [] args) {

        System.out.println("\n=========== FIRST REPEATING CHARACTER ============\n");
        String text = "programming";

        System.out.println("Original: " + text);

        for(int i = 0; i < text.length(); i++) {
            int frequency = 0;

            for(int j = i + 1; j < text.length(); j++) {
                if(text.charAt(i) == text.charAt(j)) {
                    frequency++;
                }
            }
            if(frequency == 1) {
                System.out.println("First repeating character: " + text.charAt(i));
                break;  
            }
        } 
    }
}