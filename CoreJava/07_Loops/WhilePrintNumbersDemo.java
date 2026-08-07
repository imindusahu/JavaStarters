public class WhilePrintNumbersDemo {
    public static void main(String [] args) {
        printNumbers();
    }

    private static void printNumbers() {
        int count = 1;

        while(count <= 5) {
            System.out.println(count);
            count++;
        }
    }
}