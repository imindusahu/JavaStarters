public class SquarePatternDemo {
    public static void main(String [] args) {
        printSquarePattern();
        printRowNumberSquarePattern();
    }

    private static void printSquarePattern() {
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRowNumberSquarePattern() {
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= 5; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 



1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 


*/
