public class ForEvenNumbersDemo {
    public static void main(String [] args) {
        printEvenNumbers();
    }

    private static void printEvenNumbers() {
        for(int count = 2; count <= 10; count += 2) {
            System.out.println(count);
        }
    }
}