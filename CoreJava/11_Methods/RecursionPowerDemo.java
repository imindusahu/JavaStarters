public class RecursionPowerDemo {

    // Recursive method to calculate power
    static int power(int base, int exponent) {

        // Base case
        if (exponent == 0) {
            return 1;
        }

        // Recursive case
        return base * power(base, exponent - 1);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSIVE POWER =========");

        int base = 2;
        int exponent = 5;

        int result = power(base, exponent);

        System.out.println("Base: " + base);
        System.out.println("Exponent: " + exponent);
        System.out.println("Result: " + result);
    }
}