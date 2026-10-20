import java.util.Arrays;
import java.util.List;

public class GenericCollectionUtilityDemo {

    public static <T> void printElements(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++");

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        List<Double> prices = Arrays.asList(99.5, 149.99);

        System.out.println("Languages:");
        printElements(languages);

        System.out.println("\nNumbers:");
        printElements(numbers);

        System.out.println("\nPrices:");
        printElements(prices);
    }
}