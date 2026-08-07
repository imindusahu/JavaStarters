public class InvertedTrianglePattern {
    public static void main(String [] args) {
        printStarInvertedTrianglePattern();
        printColumnNumberInvertedTrianglePattern();
        printRowNumberInvertedTrianglePattern();
        printAlphabetInvertedTrianglePattern();
    }

    private static void printStarInvertedTrianglePattern() {
        System.out.println("\n====== Printing Star Inverted Triangle Pattern ======\n");
        for(int row = 5; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printColumnNumberInvertedTrianglePattern() {
        System.out.println("\n\n===== Printing Column Number Inverted Triangle Pattern =====\n");
        for(int row = 5; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void printRowNumberInvertedTrianglePattern() {
        System.out.println("\n\n===== Printing Row Number Inverted Triangle Pattern =====\n");
        for(int row = 5; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    private static void printAlphabetInvertedTrianglePattern() {
        System.out.println("\n\n===== Printing Alphabet Inverted Triangle Pattern =====\n");
        for(int row = 5; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                char alphabet = (char)('A' + col - 1);
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

}