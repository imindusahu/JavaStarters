public class CountWordsDemo {

    public static void main(String[] args) {
        countWordsUsingSplit();
        countWordsWithoutSplit();
    }

    private static void countWordsUsingSplit() {

        System.out.println("\n========== COUNT WORDS WITH SPLIT ===========\n");

        String text = "Java Backend Developer";

        String[] words = text.split(" ");

        System.out.println("Original: " + text);
        System.out.println("Word count: " + words.length);
    }

    private static void countWordsWithoutSplit() {

        System.out.println("\n========== COUNT WORDS WITHOUT SPLIT ===========\n");

        String text = "Java Backend Developer";
        int count = 0;

        for(int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch != ' ' && (i == 0 || text.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        System.out.println("Original: " + text);
        System.out.println("Word count: " + count);
    }
}