public class StringCreationDemo {

    public static void main(String[] args) {

        //  create string in String Pool
        String str1 = "Java";

        // create string in Heap memory
        String str2 = new String("Backend");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}