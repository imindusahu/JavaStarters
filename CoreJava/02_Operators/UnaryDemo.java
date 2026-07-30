public class UnaryDemo {

    public static void main(String [] args) {
        showsUnaryOperators();
    }


    private static void showsUnaryOperators() {
        int count = 10;
        

        System.out.println("========== UNARY OPERATORS ==========\n");

        System.out.println("Initial value   : " + count);
        System.out.println("After Increment : " + count);
        count++;
        System.out.println("After Decrement : " + count);
        count--;
        System.out.println();

    }
}