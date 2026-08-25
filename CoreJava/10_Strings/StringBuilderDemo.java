public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Java");

        System.out.println("Original: " + builder);

        builder.append(" Backend");

        System.out.println("After append: " + builder);

        builder.append(" Developer");

        System.out.println("After second append: " + builder);
    }
}