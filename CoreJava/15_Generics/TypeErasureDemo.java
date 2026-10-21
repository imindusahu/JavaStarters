
import java.util.ArrayList;
import java.util.List;

public class TypeErasureDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");

        String firstLanguage = languages.get(0);

        System.out.println(firstLanguage);
        System.out.println(languages.getClass().getName());
    }
}
