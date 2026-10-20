import java.util.HashSet;
import java.util.Set;

public class GenericsWithSetDemo {
    public static void main(String[] args) {
        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Java");
        skills.add("Spring Boot");

        System.out.println(skills);
        System.out.println("Total skills: " + skills.size());
    }
}