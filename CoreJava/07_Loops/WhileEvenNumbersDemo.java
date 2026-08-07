public class WhileEvenNumbersDemo {
    public static void main(String [] args) {
        printEvenNumbers();
    }

    private static void printEvenNumbers() {
        int count = 1;

        while(count <= 10) {
            if(count % 2 == 0)
                System.out.println(count);
                count++;
        }
    }
}