import java.util.Arrays;
import java.util.List;

public class LambdaSortingDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(50, 10, 40, 20, 30);

        // Ascending order
        numbers.sort((a, b) -> a - b);

        System.out.println("Ascending: " + numbers);

        // Descending order
        numbers.sort((a, b) -> b - a);

        System.out.println("Descending: " + numbers);
    }
}