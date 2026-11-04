
@FunctionalInterface
interface NamePrinter {
    void printName(String name);
}

public class NameFunctionalInterfaceDemo {

    public static void main(String[] args) {

        NamePrinter printer = name ->
                System.out.println("Your name is: " + name);

        printer.printName("Alice");
        printer.printName("Bob");
    }
}
