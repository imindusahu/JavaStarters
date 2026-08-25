public class StringToggleCaseDemo {
    public static void main(String [] args) {

        System.out.println("\n========= TOGGLE CASE =========\n");

        String text = "Java Backend";

        System.out.println("Original: " + text);
        System.out.print("Toggled: ");

        for(int i = 0; i < text.length(); i++ ) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
               System.out.print((char)(ch + 32));    
            } else if(ch >= 'a' && ch <= 'z') {
                 System.out.print((char)(ch - 32));
            } else {
                System.out.print(" ");
            }
        }
    }
}