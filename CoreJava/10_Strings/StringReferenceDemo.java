public class StringReferenceDemo {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = str1;

        System.out.println("Before:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        str1 = "Python";

        System.out.println("\nAfter:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}