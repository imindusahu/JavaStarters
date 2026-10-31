
interface Processor<T> {
    T process(T input);
}

class NumberProcessor<T extends Number> implements Processor<T> {
    @Override
    public T process(T input) {
        System.out.println("Processing number: " + input);
        return input;
    }
}

public class GenericProcessorDemo {
    public static void main(String[] args) {
        
        Processor<Integer> integerProcessor = new NumberProcessor<Integer>();

        Integer result = integerProcessor.process(42);
        System.out.println("Result: " + result);

        Processor<Double> doubleProcessor = new NumberProcessor<Double>();

        Double decimalResult = doubleProcessor.process(9.5);
        System.out.println("Result: " + decimalResult);
    }
}
