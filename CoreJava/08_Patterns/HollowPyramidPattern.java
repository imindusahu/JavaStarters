public class HollowPyramidPattern {
    public static void main(String [] args) {
        printStarHollowPyramidPattern();
        printRowNumberHollowPyramidPattern();
        printColumnNumberHollowPyramidPattern();
        printRowAlphabetHollowPyramidPattern();
        printColumnAlphabetHollowPyramidPattern();
    }

    private static void printStarHollowPyramidPattern() {
        System.out.println("\n====== Printing Star Hollow Pyramid Pattern ======\n");

        int TotalRows = 5;

        for(int row = 1; row <= TotalRows; row++) {
            for(int space = 1; space <= TotalRows - row; space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= (2 * row - 1); col++) {
                if(col == 1 || col == (2 * row - 1) || row == TotalRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println();
        } 
    }

    private static void printRowNumberHollowPyramidPattern() {
        System.out.println("\n====== Printing Row Number Hollow Pyramid Pattern ======\n");

        int TotalRows = 5;
        
        for(int row = 1; row <= TotalRows; row++) {
            for(int space = 1; space <= TotalRows - row; space++) {
                System.out.print(" ");
            } 
            for(int col = 1; col <= (2 * row - 1); col++) {
                if(col == 1 || col == (2 * row - 1) || row == TotalRows) {
                    System.out.print(row);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printColumnNumberHollowPyramidPattern() {
        System.out.println("\n====== Printing Column Number Hollow Pyramid Pattern ======\n");
        int TotalRows = 5;
        for(int row = 1; row <= TotalRows; row++) {
            for(int space = 1; space <= TotalRows - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                if(col == 1 || col == (2 * row - 1) || row == TotalRows) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    private static void printRowAlphabetHollowPyramidPattern() {
        System.out.println("\n====== Printing Row Alphabet Hollow Pyramid Pattern ======\n");
        int TotalRows = 5;
        for(int row = 1; row <= TotalRows; row++) {
            for(int space = 1; space <= TotalRows - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                if(col == 1 || col == (2 * row - 1) || row == TotalRows) {
                    char alphabet = (char)('A' + row - 1);
                    System.out.print(alphabet);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printColumnAlphabetHollowPyramidPattern() {
        System.out.println("\n====== Printing Column Alphabet Hollow Pyramid Pattern ======\n");
        int TotalRows = 5;
        for(int row = 1; row <= TotalRows; row++) {
            for(int space = 1; space <= TotalRows - row; space++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= (2 * row - 1); col++) {
                if(col == 1 || col == (2 * row - 1) || row == TotalRows) {
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

/*

Logic to print Hollow Pyramid Pattern
1. Print the required number of spaces before the first star in each row.
2. Print the required number of stars in each row.
3. Print the required number of spaces after the last star in each row.


if
    leftBorder == 1 || rightBorder == (2 * row - 1) || bottomBorder == TotalRows
then
    print the required character
else
    print space

*/