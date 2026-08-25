public class RemoveSpacesDemo {

    public static void main(String[] args) {

        String text = "Java Backend Developer";

        String result = text.replace(" ", "");

        System.out.println("Original: " + text);
        System.out.println("After removing spaces: " + result);
    }
}