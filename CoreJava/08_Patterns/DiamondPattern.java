
public class DiamondPattern {
    public static void main(String [] args) {
        printStarDiamondPattern();
        printColumnNumberDiamondPattern();
        printRowNumberDiamondPattern();
        printRowAlphabetDiamondPattern();
        printColumnAlphabetDiamondPattern();
    }

    private static void printStarDiamondPattern() {
        System.out.println("\n====== Printing Star Diamond Pattern ======\n");
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

        for(int row = totalRows - 1; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printColumnNumberDiamondPattern() {
        System.out.println("\n====== Printing Column Number Diamond Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space  = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(col);
            }
            System.out.println();
        }

        for(int row = totalRows - 1; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" "); 
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void printRowNumberDiamondPattern() {
        System.out.println("\n====== Printing Row Number Diamond Pattern ======\n");
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

        for(int row = totalRows - 1; row >= 1; row--) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private static void printRowAlphabetDiamondPattern() {
        System.out.println("\n====== Printing Row Alphabet Diamond Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                char alphabet = (char)('A' + row - 1);
                System.out.print(alphabet);
            }
            System.out.println();
        }

        for(int row = totalRows - 1; row >= 1; row--) {
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

    private static void printColumnAlphabetDiamondPattern() {
        System.out.println("\n====== Printing Column Alphabet Diamond Pattern ======\n");
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

        for(int row = totalRows - 1; row >= 1; row--) {
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