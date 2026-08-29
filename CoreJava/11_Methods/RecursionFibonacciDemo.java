public class RecursionFibonacciDemo {

    // Recursive method to find Fibonacci number
    static int fibonacci(int number) {

        // Base case 1
        if (number == 0) {
            return 0;
        }

        // Base case 2
        if (number == 1) {
            return 1;
        }

        // Recursive case
        return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE FIBONACCI =========");

        int number = 5;

        int result = fibonacci(number);

        System.out.println("Position: " + number);
        System.out.println("Fibonacci value: " + result);
    }
}