public class ForLoopDemo {
    public static void main(String [] args) {
        printNumbers();
    }

    private static void printNumbers() {
        for(int count = 1; count <= 5; count++) {
            System.out.println(count);
        }
    }
}


/*  Execution Flow of For Loop

 Initialization
      │
      ▼
Check Condition
      │
 ┌────┴─────┐
 │          │
True      False
 │          │
 ▼          ▼
Execute     End
 │
 ▼
Update
 │
 └──────────► Check Condition Again

 */