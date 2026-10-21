import java.lang.reflect.Array;

public class GenericArrayDemo {
    @SuppressWarnings("unchecked")
    public static <T> T[] createArray(Class<T> type, int size) {
        return (T[]) Array.newInstance(type, size);
    }

    public static void main(String[] args) {
        String[] names = createArray(String.class, 3);
        names[0] = "Indu";

        System.out.println(names[0]);
        System.out.println(names.length);
    }
}