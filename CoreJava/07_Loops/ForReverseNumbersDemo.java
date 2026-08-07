public class ForReverseNumbersDemo {
    public static void main(String [] args) {
        printReverseNumbers();
    }

    private static void printReverseNumbers() {
        for(int count = 5; count >= 1; count--) {
            System.out.println(count);
        }
    }
}