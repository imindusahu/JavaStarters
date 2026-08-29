public class MethodScopeDemo {

    // ============================================================
    // METHOD ONE
    // ============================================================

    static void methodOne() {

        int number = 10;

        System.out.println("Method One Number: " + number);
    }


    // ============================================================
    // METHOD TWO
    // ============================================================

    static void methodTwo() {

        int number = 20;

        System.out.println("Method Two Number: " + number);
    }


    // ============================================================
    // BLOCK SCOPE
    // ============================================================

    static void blockScopeDemo() {

        int outerNumber = 100;

        System.out.println("Outside Block: " + outerNumber);

        if (true) {

            int innerNumber = 200;

            System.out.println("Inside Block: " + innerNumber);
        }

        // outerNumber is accessible here
        System.out.println("After Block: " + outerNumber);

        // innerNumber would NOT be accessible here
        // System.out.println(innerNumber); // ❌
    }


    public static void main(String[] args) {

        System.out.println("========= METHOD SCOPE =========");

        methodOne();

        methodTwo();


        System.out.println("\n========= BLOCK SCOPE =========");

        blockScopeDemo();
    }
}