public class StringIsEmptyDemo {

    public static void main(String[] args) {

        String str1 = "";  // empty
        String str2 = "Java"; // NOT empty
        String str3 = " ";   // NOT empty

        System.out.println("str1 is empty: " + str1.isEmpty());  // true
        System.out.println("str2 is empty: " + str2.isEmpty());  // false
        System.out.println("str3 is empty: " + str3.isEmpty());  // false
    }
}