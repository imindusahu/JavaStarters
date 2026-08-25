public class StringReplaceAllDemo {

    public static void main(String[] args) {

        // replaceAll() uses regular expressions (regex).

        String text = "Java123Backend456Developer";

        String result = text.replaceAll("[0-9]", "");  // Match any digit from 0 through 9 then replace it with nothing.

        System.out.println("Original: " + text);     // Original: Java123Backend456Developer
        System.out.println("After removing digits: " + result);   // After removing digits: JavaBackendDeveloper

        String phone = "98765-43210";

        String cleanPhone = phone.replaceAll("-", "");

        System.out.println("Original phone: " + phone);  // Original phone: 98765-43210
        System.out.println("Clean phone: " + cleanPhone);  // Clean phone: 9876543210
    }
}