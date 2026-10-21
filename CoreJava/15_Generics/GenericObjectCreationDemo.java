import java.util.function.Supplier;

class Box<T> {
    private final T value;

    public Box(Supplier<T> factory) {
        this.value = factory.get();
    }

    public T getValue() {
        return value;
    }
}

public class GenericObjectCreationDemo {
    public static void main(String[] args) {
        Box<StringBuilder> box =
                new Box<>(StringBuilder::new);

        System.out.println(box.getValue().getClass().getName());
    }
}