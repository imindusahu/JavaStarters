public class DoWhilePrintNumbersDemo {
    public static void main(String [] args) {
        printNumbers();
    }

    private static void printNumbers() {
        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while(number <= 5);
    }
}