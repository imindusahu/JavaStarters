public class HollowRectanglePattern {
    public static void main(String [] args) {
        printStarHollowRectanglePattern();
        printColumnNumberHollowRectanglePattern();
        printRowNumberHollowRectanglePattern();
        printRowAlphabetHollowRectanglePattern();
        printColumnAlphabetHollowRectanglePattern();
    }

    private static void printStarHollowRectanglePattern() {
        System.out.println("\n====== Printing Star Hollow Rectangle Pattern ======\n");
        int totalRows = 5;
        int totalCols = 10;
        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= totalCols; col++) {
                if(row == 1 || row == totalRows || col == 1 || col == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printColumnNumberHollowRectanglePattern() {
        System.out.println("\n====== Printing Column Number Hollow Rectangle Pattern ======\n");
        int totalRows = 5;
        int totalCols = 10;
        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= totalCols; col++) {
                if(row == 1 || row == totalRows || col == 1 || col == totalCols) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printRowNumberHollowRectanglePattern() {
        System.out.println("\n====== Printing Row Number Hollow Rectangle Pattern ======\n");
        int totalRows = 5;
        int totalCols = 10;
        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= totalCols; col++) {
                if(row == 1 || row == totalRows || col == 1 || col == totalCols) {
                    System.out.print(row);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printRowAlphabetHollowRectanglePattern() {
        System.out.println("\n====== Printing Row Alphabet Hollow Rectangle Pattern ======\n");
        int totalRows = 5;
        int totalCols = 10;
        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= totalCols; col++) {
                if(row == 1 || row == totalRows || col == 1 || col == totalCols) {
                    char alphabet = (char)(64 + row);
                    System.out.print(alphabet);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printColumnAlphabetHollowRectanglePattern() {
        System.out.println("\n====== Printing Column Alphabet Hollow Rectangle Pattern ======\n");
        int totalRows = 5;
        int totalCols = 10;
        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= totalCols; col++) {
                if(row == 1 || row == totalRows || col == 1 || col == totalCols) {
                    char alphabet = (char)('A' + col - 1);
                    System.out.print(alphabet);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}