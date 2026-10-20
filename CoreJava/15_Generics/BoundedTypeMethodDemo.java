
public class BoundedTypeMethodDemo {

    public static <T extends Number> double add(
            T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
        System.out.println(add(5, 2.5));
        
        // Compilation error:
        // System.out.println(add("Hello", "Java"));
    }
}
