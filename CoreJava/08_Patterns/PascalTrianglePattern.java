public class PascalTrianglePattern {
    public static void main(String [] args) {
        printPascalTriangle();
    } 

    private static final int TOTAL_ROWS = 7;

    private static void printPascalTriangle() {
        System.out.println("\n====== Printing Pascal's Triangle Pattern ======\n");

        for(int row = 0; row < TOTAL_ROWS; row++) {
            for(int space = 1; space <= (TOTAL_ROWS - row); space++) {
                System.out.print(" ");
            }

            int currentValue = 1;
            for(int col = 0; col <= row; col++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}

/*

NOTES: 
    Pascal Triangle required 0-based indexing.


FORMULA:

    nextValue = currentValue × (row - col)
            --------------------------
                 (col + 1)

*/