public class StringIsBlankDemo {

    public static void main(String[] args) {

        // isBlank() was introduced in Java 11.

        String str1 = "";  // blank
        String str2 = "Java"; // NOT blank
        String str3 = " ";   // blank
        String str4 = "   "; // blank

        System.out.println("str1 is blank: " + str1.isBlank()); // true
        System.out.println("str2 is blank: " + str2.isBlank()); // false
        System.out.println("str3 is blank: " + str3.isBlank()); // true
        System.out.println("str4 is blank: " + str4.isBlank()); // true
    }
}