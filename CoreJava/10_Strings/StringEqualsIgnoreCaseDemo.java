public class StringEqualsIgnoreCaseDemo {

    public static void main(String[] args) {

        // case-sensitive and case-insensitive String comparison.
        
        String str1 = "Java";
        String str2 = "java";
        String str3 = "JAVA";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): "
                + str1.equalsIgnoreCase(str2));

        System.out.println("str1.equalsIgnoreCase(str3): "
                + str1.equalsIgnoreCase(str3));
    }
}