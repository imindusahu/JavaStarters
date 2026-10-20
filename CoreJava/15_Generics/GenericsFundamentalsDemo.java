
import java.util.ArrayList;

public class GenericsFundamentalsDemo {
    public static void main(String[] args) {

        // 1. Create an ArrayList that stores Strings
        ArrayList<String> languages = new ArrayList<>();

        // 2. Add three programming languages
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // 3. Print all languages using a loop
        for (String language : languages) {
            System.out.println(language);
        }

        // 4. Uncomment this line to observe the compiler error
        // languages.add(100);
    }
}
