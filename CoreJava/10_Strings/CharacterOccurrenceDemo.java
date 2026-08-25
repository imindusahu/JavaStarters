public class CharacterOccurrenceDemo {
    public static void main(String [] args) {

        System.out.println("\n========= COUNT OCCURRENCES OF A CHARACTER ==========\n");

        String text = "programming";
        char target = 'm';
        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Original: " + text);
        System.out.println("Target character: " + target);
        System.out.println("Frequency: " + count);
    }
}