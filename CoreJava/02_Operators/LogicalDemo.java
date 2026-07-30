public class LogicalDemo {

    public static void main(String [] args) {
        showsLogicalOperators();
    }


    private static void showsLogicalOperators() {
        boolean knowsJava = true;
        boolean knowsPython = false;

        System.out.println("========== LOGICAL OPERATORS ==========\n");

        System.out.println("knowsJava && knowsPython : " + (knowsJava && knowsPython));
        System.out.println("knowsJava || knowsPython : " + (knowsJava || knowsPython));
        System.out.println("!knowsJava               : " + (!knowsJava));
        System.out.println("!knowsPython             : " + (!knowsPython));
        System.out.println();

    }
}