public class RecursionIntroductionDemo {

    static void countDown(int number) {

        // Base case
        if (number == 0) {
            return;
        }

        // Print current number
        System.out.println(number);

        // Recursive call
        countDown(number - 1);
    }


    public static void main(String[] args) {

        System.out.println("========= RECURSION =========");

        countDown(5);
    }
}