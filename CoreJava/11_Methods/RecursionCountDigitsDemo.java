public class RecursionCountDigitsDemo {

    static int countDigits(int number) {

        // Base case
        if (number == 0) {
            return 0;
        }

        // Recursive case
        return 1 + countDigits(number / 10);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE COUNT DIGITS =========");

        int number = 0;

        int result;

        if (number == 0) {
            result = 1;
        } else {
            result = countDigits(number);
        }

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + result);
    }
}