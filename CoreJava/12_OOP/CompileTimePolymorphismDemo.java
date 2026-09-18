class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("\n========= COMPILE-TIME POLYMORPHISM =========\n");

        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 20);

        int result2 = calculator.add(10, 20, 30);

        double result3 = calculator.add(10.5, 20.5);

        String result4 = calculator.add("Java ", "Backend");

        int result5 = calculator.multiply(5, 10);

        double result6 = calculator.multiply(5.5, 2.0);

        System.out.println("add(int, int): " + result1);
        System.out.println("add(int, int, int): " + result2);
        System.out.println("add(double, double): " + result3);
        System.out.println("add(String, String): " + result4);
        System.out.println("multiply(int, int): " + result5);
        System.out.println("multiply(double, double): " + result6);
    }
}