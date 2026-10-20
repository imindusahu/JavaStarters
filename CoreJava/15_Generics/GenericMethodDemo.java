
public class GenericMethodDemo {

    // Generic method
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
        System.out.println();
    }

    // Generic Display method:
    //Generic method that to print any type of value
     public static <T> void display(T value) {
        System.out.println(value);
     }

    // Generic Return Method:
    // Generic method that returns the supplied value
    public static <T> T identity(T value) {
        return value;
    }

    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {

        printValue("Java");
        printValue(100);
        printValue(99.5);
        printValue(true);

        display("Hello, World!");  // String
        display(42);       // Integer
        display(true);     // Boolean

        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        System.out.print("String Array: ");
        printArray(stringArray);

        System.out.print("Integer Array: ");
        printArray(intArray);

    }
}
