public class StringSplitDemo {

    public static void main(String[] args) {

        //  split() is especially important for backend programming because you'll frequently need to break data into pieces.

        stringSplit();
        stringSplitSpace();
    }

    private static void stringSplit() {

        System.out.println("\n======== STRING SPLIT WITH COMMAS =========\n");

        String languages = "Java,Python,C++,JavaScript";

        String[] result = languages.split(",");  // Split the String wherever , occurs means split on commas

        System.out.println("Languages:");

        for (String language : result) {
            System.out.println(language);
        }
    }

    private static void stringSplitSpace() {

        System.out.println("\n======== STRING SPLIT WITH SPACES =========\n");

        String sentence = "I am learning Java Backend Development";

        String[] words = sentence.split(" ");  //  Split the String wherever " " occurs means split on spaces.

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }
    }

}