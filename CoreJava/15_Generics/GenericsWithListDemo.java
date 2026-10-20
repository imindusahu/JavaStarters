
import java.util.ArrayList;
import java.util.List;

public class GenericsWithListDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        for (String language : languages) {
            System.out.println(language);
        }

        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);

        System.out.println("Scores: " + scores);
    }
}
