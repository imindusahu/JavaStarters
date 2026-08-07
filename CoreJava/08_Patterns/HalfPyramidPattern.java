public class HalfPyramidPattern {
    public static void main(String [] args) {
        printStarHalfPyramidPattern();
        printColumnNumberHalfPyramidPattern();
        printRowNumberHalfPyramidPattern();
        printAlphabetHalfPyramidPattern();
    }

    private static void printStarHalfPyramidPattern() {
        System.out.println("\n====== Printing Star Half Pyramid Pattern ======\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printColumnNumberHalfPyramidPattern() {
        System.out.println("\n\n===== Printing Column Number Half Pyramid Pattern =====\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void printRowNumberHalfPyramidPattern() {
        System.out.println("\n\n===== Printing Row Number Half Pyramid Pattern =====\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    private static void printAlphabetHalfPyramidPattern() {
        System.out.println("\n\n===== Printing Alphabet Half Pyramid Pattern =====\n");
        int totalRows = 5;
        for(int row = 1; row <= totalRows; row++) {
            for(int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++) {
                char alphabet = (char)('A' + col - 1);
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:

====== Printing Star Half Pyramid Pattern ======

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/