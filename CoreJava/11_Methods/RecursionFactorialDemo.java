public class RecursionFactorialDemo {

    // Recursive method to calculate factorial
    static int factorial(int number) {

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE FACTORIAL =========");

        int number = 5;

        int result = factorial(number);

        System.out.println("Number: " + number);
        System.out.println("Factorial: " + result);
    }
}