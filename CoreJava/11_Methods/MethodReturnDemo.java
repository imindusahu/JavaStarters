public class MethodReturnDemo {

    // Returns the sum of two integers
    static int add(int a, int b) {

        return a + b;
    }


    // Returns the product of two integers
    static int multiply(int a, int b) {

        return a * b;
    }


    // Returns the average of two numbers
    static double calculateAverage(double a, double b) {

        return (a + b) / 2;
    }


    // Returns a String
    static String getName() {

        return "Indu";
    }


    // Returns true if the number is even
    static boolean isEven(int number) {

        return number % 2 == 0;
    }


    public static void main(String[] args) {

        System.out.println("========= INTEGER RETURN =========");

        int sum = add(10, 20);

        System.out.println("Sum: " + sum);


        System.out.println("\n========= MULTIPLICATION =========");

        int product = multiply(5, 4);

        System.out.println("Product: " + product);


        System.out.println("\n========= DOUBLE RETURN =========");

        double average = calculateAverage(10, 20);

        System.out.println("Average: " + average);


        System.out.println("\n========= STRING RETURN =========");

        String name = getName();

        System.out.println("Name: " + name);


        System.out.println("\n========= BOOLEAN RETURN =========");

        boolean result = isEven(10);

        System.out.println("Is Even: " + result);
    }
}