public class NestedLoopDemo {
    public static void main(String [] args) {
        printRowsAndColumns();
    }

    private static void printRowsAndColumns() {
        for(int row = 1; row <= 3; row++) {
            System.out.println("Row " + row);

            for(int column = 1; column <= 3; column++) {
                System.out.println("Column " + column);
            }

            System.out.println();
        }
    }
}