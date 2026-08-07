public class RightTrianglePattern {
    public static void main(String [] args) {
        printStarRightTrianglePattern();
        printColumnNumberRightTrianglePattern();
        printRowNumberRightTrianglePattern();
        printAlphabetRightTrianglePattern();
    }

    private static void printStarRightTrianglePattern() {
        System.out.println("\n====== Printing Star Right Triangle Pattern ======\n");
        for(int row = 1; row <= 5; row++) {             // rows = 5
            for(int col = 1; col <= row; col++) {       // columns = row
                System.out.print("* ");                 // print = *
            }
            System.out.println();
        }
    }

    private static void printColumnNumberRightTrianglePattern() {
        System.out.println("\n\n===== Printing Column Number Right Triangle Pattern =====\n");
        for(int row = 1; row <= 5; row++) {             // rows = 5
            for(int col = 1; col <= row; col++) {       // columns = row
                System.out.print(col + " ");            // print = column
            }
            System.out.println();
        }
    

    private static void printRowNumberRightTrianglePattern() {
        System.out.println("\n\n===== Printing Row Number Right Triangle Pattern =====\n");
        for(int row = 1; row <= 5; row++) {             // rows = 5
            for(int col = 1; col <= row; col++) {   // columns = row
                System.out.print(row + " ");        // print = row
            }
            System.out.println();
        }
    }

    private static void printAlphabetRightTrianglePattern() {
        System.out.println("\n\n===== Printing Alphabet Right Triangle Pattern =====\n");
        for(int row = 1; row <= 5; row++) {             // rows = 5
            for(int col = 1; col <= row; col++) {       // columns = row
                char alphabet = (char)('A' + col - 1);
                System.out.print(alphabet + " ");       // print = character
            }
            System.out.println();
        }
    }

}

/*

Output:

====== Printing Star Right Triangle Pattern ======

* 
* * 
* * * 
* * * * 
* * * * * 


===== Printing Number Right Triangle Pattern =====

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/