public class RectanglePatternDemo {
    public static void main(String [] args) {
        printStarRectanglePattern();
        printNumberRectanglePattern();
    }

    private static void printStarRectanglePattern() {
        for(int row = 1; row <= 3; row++) {
            for(int col = 1; col <= 8; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void printNumberRectanglePattern() {
        for(int row = 1; row <= 3; row++) {
            for(int col = 1; col <= 8; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:

* * * * * * * *
* * * * * * * *
* * * * * * * *


1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8

*/