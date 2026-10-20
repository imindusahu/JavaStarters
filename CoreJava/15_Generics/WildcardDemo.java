
import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<String> languages =
                Arrays.asList("Java", "Python", "C++");

        List<Integer> numbers =
                Arrays.asList(10, 20, 30);

        printList(languages);

        System.out.println("---");

        printList(numbers);
    }
}
