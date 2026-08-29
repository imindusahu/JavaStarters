public class RecursionFibonacciSeriesDemo {

    // Recursive method to calculate Fibonacci value
    static int fibonacci(int number) {

        // Base case
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        // Recursive case
        return fibonacci(number - 1) + fibonacci(number - 2);
    }


    public static void main(String[] args) {

        System.out.println("========= FIBONACCI SERIES =========");

        int terms = 10;

        System.out.print("Series: ");

        for (int i = 0; i < terms; i++) {

            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
    }
}


// Time Complexity: O(2^n)