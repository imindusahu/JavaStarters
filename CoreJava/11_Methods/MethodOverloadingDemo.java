public class MethodOverloadingDemo {

    // ============================================================
    // Method 1
    // Two integer parameters
    // ============================================================

    static int add(int a, int b) {

        return a + b;
    }


    // ============================================================
    // Method 2
    // Three integer parameters
    // ============================================================

    static int add(int a, int b, int c) {

        return a + b + c;
    }


    // ============================================================
    // Method 3
    // Two double parameters
    // ============================================================

    static double add(double a, double b) {

        return a + b;
    }


    // ============================================================
    // Method 4
    // Two String parameters
    // ============================================================

    static String add(String first, String second) {

        return first + " " + second;
    }


    public static void main(String[] args) {

        System.out.println("========= METHOD OVERLOADING =========");


        // Calls add(int, int)
        int result1 = add(10, 20);

        System.out.println("add(int, int): " + result1);


        // Calls add(int, int, int)
        int result2 = add(10, 20, 30);

        System.out.println("add(int, int, int): " + result2);


        // Calls add(double, double)
        double result3 = add(10.5, 20.5);

        System.out.println("add(double, double): " + result3);


        // Calls add(String, String)
        String result4 = add("Java", "Backend");

        System.out.println("add(String, String): " + result4);
    }
}