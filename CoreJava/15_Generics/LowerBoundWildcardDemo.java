
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardDemo {

    public static void addNumbers(
            List<? super Integer> numbers) {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addNumbers(integers);
        addNumbers(numbers);
        addNumbers(objects);

        System.out.println(integers);
        System.out.println(numbers);
        System.out.println(objects);
    }
}
