public class RecursionCallStackDemo {

    static void count(int number) {

        // Base case
        if (number == 0) {
            return;
        }

        System.out.println("Entering: " + number);

        // Recursive call
        count(number - 1);

        // Executes while returning
        System.out.println("Returning: " + number);
    }


    public static void main(String[] args) {

        System.out.println("========= CALL STACK =========");

        count(3);
    }
}