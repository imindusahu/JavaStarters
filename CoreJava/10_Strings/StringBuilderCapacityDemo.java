public class StringBuilderCapacityDemo {

    public static void main(String[] args) {

        System.out.println("\n========= STRINGBUILDER CAPACITY ==========\n");

        StringBuilder sb = new StringBuilder();

        System.out.println("Initial length: " + sb.length());
        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("Java");

        System.out.println("\nAfter adding Java:");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Backend Developer");

        System.out.println("\nAfter adding Backend Developer:");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}