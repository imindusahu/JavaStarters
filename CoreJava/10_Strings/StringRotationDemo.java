public class StringRotationDemo {
    public static void main(String [] args) {
        System.out.println("\n========= CHECK STRING ROTATION ==========\n");

        String str1 = "abcd";
        String str2 = "cdab";

        boolean isRotation = false;

        if(str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            isRotation = true;
        }

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Rotation: " + isRotation);
    }
}