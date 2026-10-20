import java.util.HashMap;
import java.util.Map;

public class GenericsWithMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Indu", 92);
        marks.put("Rahul", 85);
        marks.put("Priya", 95);

        System.out.println(marks);
        System.out.println("Indu's marks: " + marks.get("Indu"));

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}