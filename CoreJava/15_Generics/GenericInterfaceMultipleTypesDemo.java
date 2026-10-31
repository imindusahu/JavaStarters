
interface Printer<T> {
    void print(T value);
}

class StringPrinter implements Printer<String> {
    @Override
    public void print(String value) {
        System.out.println("String: " + value);
    }
}

class IntegerPrinter implements Printer<Integer> {
    @Override
    public void print(Integer value) {
        System.out.println("Integer: " + value);
    }
}

public class GenericInterfaceMultipleTypesDemo {
    public static void main(String[] args) {
        Printer<String> stringPrinter = new StringPrinter();
        Printer<Integer> integerPrinter = new IntegerPrinter();

        stringPrinter.print("Hello Java");
        integerPrinter.print(100);
    }
}
