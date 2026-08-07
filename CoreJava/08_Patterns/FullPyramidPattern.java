public class FullPyramidPattern {
    public static void main(String [] args) {
        printStarFullPyramidPattern();
        printColumnNumberFullPyramidPattern();
        printRowNumberFullPyramidPattern();
        printRowAlphabetFullPyramidPattern();
        printColumnAlphabetFullPyramidPattern();
    }

    private static void printStarFullPyramidPattern() {
        System.out.println("\n====== Printing Star Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printColumnNumberFullPyramidPattern() {
        System.out.println("\n====== Printing Column Number Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRowNumberFullPyramidPattern() {
        System.out.println("\n====== Printing Row Number Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private static void printColumnAlphabetFullPyramidPattern() {
        System.out.println("\n====== Printing Column Alphabet Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
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

     private static void printRowAlphabetFullPyramidPattern() {
        System.out.println("\n====== Printing Row Alphabet Full Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                char alphabet = (char)(64 + row);
                System.out.print(alphabet);
            }
            System.out.println();

        }
    }
}