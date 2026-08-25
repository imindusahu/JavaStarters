public class StringImmutabilityDemo {

    public static void main(String[] args) {

        String text = "Java";

        System.out.println("Original: " + text);

        text.concat(" Backend");

        System.out.println("After concat(): " + text);

        text = text.concat(" Developer");

        System.out.println("After assigning concat(): " + text);
    }
}