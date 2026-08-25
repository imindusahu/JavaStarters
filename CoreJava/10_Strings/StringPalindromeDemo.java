public class StringPalindromeDemo {
    public static void main(String [] args) {
        String text = "madam";

        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);

        // if(reversed.equals(text)) {
        //     System.out.println("Palindrome: true");
        // } else {
        //     System.out.println("Palindrome: false");
        // }

        boolean isPalindrome = reversed.equals(text);

        System.out.println("Palindrome: " + isPalindrome);
    }
}