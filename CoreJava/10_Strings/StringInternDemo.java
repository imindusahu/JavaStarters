public class StringInternDemo {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println("Before intern: " + (str1 == str2));

        str2 = str2.intern();

        System.out.println("After intern: " + (str1 == str2));
    }
}