public class RecursionSumDemo {

    // Recursive method to calculate sum from 1 to number
    static int sum(int number) {

        // Base case
        if (number == 1) {
            return 1;
        }

        // Recursive case
        return number + sum(number - 1);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE SUM =========");

        int number = 5;

        int result = sum(number);

        System.out.println("Number: " + number);
        System.out.println("Sum: " + result);
    }
}