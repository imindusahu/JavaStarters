public class FloydTrianglePattern {
    public static void main(String [] args) {
        printNumberFloydTrianglePattern();
        printAlphabetFloydTrianglePattern();
        printBinaryFloydTrianglePattern();
        printContinuousCounterBinaryFloydTrianglePattern();
    }

    private static void printNumberFloydTrianglePattern() {
        System.out.println("\n====== Printing Number Floyd Triangle Pattern ======\n");
        int totalRows = 5;
        int number = 1;

        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void printAlphabetFloydTrianglePattern() {
        System.out.println("\n====== Printing Alphabet Floyd Triangle Pattern ======\n");
        int totalRows = 5;
        // int alphabet = 65; // ASCII value of 'A' this method is also correct
        char alphabet = 'A'; // ASCII value of 'A'

        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= row; col++) {
                // System.out.print((char)alphabet + " ");
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }

    // This is the position-based binary pattern
    private static void printBinaryFloydTrianglePattern() {
        System.out.println("\n====== Printing Binary Floyd Triangle Pattern ======\n");
        int totalRows = 5;
        int binary = 1; 

        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= row; col++) {
                if((row + col ) % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // This is the continuous counter based binary pattern
    private static void printContinuousCounterBinaryFloydTrianglePattern() {
        System.out.println("\n====== Printing Sequence Binary Floyd Triangle Pattern ======\n");
        int totalRows = 5;
        int binary = 1; 

        for(int row = 1; row <= totalRows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(binary + " ");
                binary = 1 - binary;
            }
            System.out.println();
        }
    }
}

/*

Algorithm to print Floyd Triangle Pattern:

Create number = 1

FOR every row

    Print exactly 'row' numbers

    After every print

        number++

Move to next line

*/