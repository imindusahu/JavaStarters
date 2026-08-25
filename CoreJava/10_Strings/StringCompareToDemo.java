public class StringCompareToDemo {

    public static void main(String[] args) {

        // compareTo() compares characters based on their Unicode values.

        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";
        String str4 = "apple";

        // negative → first String comes before second means first string < second string
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));

        // positive → first String comes after second means first string > second string
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));

        // 0 → Strings are equal means both strings equal
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));

        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));
    }
}