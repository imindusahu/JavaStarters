import java.util.ArrayList;
import java.util.List;

public class GenericsInvarianceDemo {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        List<Double> decimals = new ArrayList<>();
        decimals.add(3.14);
        decimals.add(2.71);

        printNumbers(integers);
        printNumbers(decimals);
    }
}