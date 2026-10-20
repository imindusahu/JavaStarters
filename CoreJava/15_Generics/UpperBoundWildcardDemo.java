
import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcardDemo {

    public static double calculateSum(
            List<? extends Number> numbers) {

        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integers =
                Arrays.asList(10, 20, 30);

        List<Double> decimals =
                Arrays.asList(1.5, 2.5, 3.0);

        System.out.println(calculateSum(integers));
        System.out.println(calculateSum(decimals));
    }
}
