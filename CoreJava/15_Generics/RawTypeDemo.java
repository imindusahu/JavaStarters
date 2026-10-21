import java.util.ArrayList;
import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");

        List<String> rawList = languages;

        rawList.add(100); // Unsafe: compiler warning

        for (String language : languages) {
            System.out.println(language);
        }
    }
}