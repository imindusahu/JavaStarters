public class InvertedFullPyramidPattern {
    public static void main(String [] args) {
        printStarInvertedFullPyramidPattern();
        printColumnNumberInvertedFullPyramidPattern();
        printRowNumberInvertedFullPyramidPattern();
        printRowAlphabetInvertedFullPyramidPattern();
        printColumnAlphabetInvertedFullPyramidPattern();
    }

    private static void printStarInvertedFullPyramidPattern() {
        System.out.println("\n====== Printing Star Inverted Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = totalRows; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {   // " row - 1 " this formula used here to calculate the number of spaces
                System.out.print(" ");
            }

            for(int col = 1; col <= (2 * row - 1); col++) {         // " 2 * (totalRows - row) + 1 " this formula also used here to calculate the number of stars 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printColumnNumberInvertedFullPyramidPattern() {
        System.out.println("\n====== Printing Column Number Inverted Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = totalRows; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRowNumberInvertedFullPyramidPattern() {
        System.out.println("\n====== Printing Row Number Inverted Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = totalRows; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private static void printRowAlphabetInvertedFullPyramidPattern() {
        System.out.println("\n====== Printing Row Alphabet Inverted Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = totalRows; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                char alphabet = (char)('A' + row - 1);
                System.out.print(alphabet);
            }
            System.out.println();
        }
    }

    private static void printColumnAlphabetInvertedFullPyramidPattern() {
        System.out.println("\n====== Printing Column Alphabet Inverted Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = totalRows; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                char alphabet = (char)('A' + col - 1);
                System.out.print(alphabet);
            }
            System.out.println();
        }
    }

}
