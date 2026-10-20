
class NumericBox<T extends Number> {

    private T value;

    public NumericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}

public class BoundedTypeClassDemo {

    public static void main(String[] args) {

        NumericBox<Integer> intBox =
                new NumericBox<>(100);

        NumericBox<Double> doubleBox =
                new NumericBox<>(99.5);

        System.out.println(intBox.getValue());
        System.out.println(intBox.getDoubleValue());

        System.out.println(doubleBox.getValue());
        System.out.println(doubleBox.getDoubleValue());

        // Compilation error:
        // NumericBox<String> textBox =
        //         new NumericBox<>("Java");
    }
}
