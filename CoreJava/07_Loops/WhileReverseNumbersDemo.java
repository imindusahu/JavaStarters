public class WhileReverseNumbersDemo {
    public static void main(String [] args) {
        printReverseNumbers();
    }

    private static void printReverseNumbers() {
        int count = 5;

        while(count >= 1) {
            System.out.println(count);
            count--;
        }

    }
}