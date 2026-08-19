public class ArrayForEachDemo {
    public static void main(String [] args) {
        printArrayUsingForEach();
    }

    private static void printArrayUsingForEach() {
        System.out.println("\n========== ARRAY FOR-EACH TRAVERSAL ============\n");

        int[] numbers = {10, 20, 30, 40, 50};

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}