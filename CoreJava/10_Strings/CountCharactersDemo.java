public class CountCharactersDemo {

    public static void main(String[] args) {

        String text = "Java Backend";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Original: " + text);
        System.out.println("Character count: " + count);
    }
}