public class RelationalDemo {

    public static void main(String [] args) {
        showsRelationalOperators();
    }


    private static void showsRelationalOperators() {
        int x = 15;
        int y = 20;

        System.out.println("========== RELATIONAL OPERATORS ==========\n");

        System.out.println(x + " > " + y + " : " + (x > y));
        System.out.println(x + " < " + y + " : " + (x < y));
        System.out.println(x + " >= " + y + " : " + (x >= y));
        System.out.println(x + " <= " + y + " : " + (x <= y));
        System.out.println(x + " == " + y + " : " + (x == y));
        System.out.println(x + " != " + y + " : " + (x != y));
        System.out.println();
    }
}