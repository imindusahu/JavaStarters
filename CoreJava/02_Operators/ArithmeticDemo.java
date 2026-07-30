public class ArithmeticDemo {

    public static void main(String [] args) {
        showsArithmeticOperators();
    }


    private static void showsArithmeticOperators() {
        int firtstNum = 25;
        int secondNum = 4;

        System.out.println("========== ARITHMETIC OPERATORS ==========\n");

        System.out.println("Addition    : " + (firtstNum + secondNum));
        System.out.println("Subtraction : " + (firtstNum - secondNum));
        System.out.println("Multiplication : " + (firtstNum * secondNum));
        System.out.println("Division : " + (firtstNum / secondNum));
        System.out.println("Modulus : " + (firtstNum % secondNum));
        System.out.println();

    }
}