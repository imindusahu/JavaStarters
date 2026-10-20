class Box<T> {
    
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {

        // Create a Box for Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Create a Box for String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String Value: " + stringBox.getValue());

        // Create a Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(99.99);
        System.out.println("Double Value: " + doubleBox.getValue());
    }
}