
@FunctionalInterface
interface Greeting {
    void greet();
}

public class GreetingFunctionalInterfaceDemo {

    public static void main(String[] args) {

        Greeting greeting = () ->
                System.out.println("Hello! Welcome to Java 8");

        greeting.greet();
    }
}
