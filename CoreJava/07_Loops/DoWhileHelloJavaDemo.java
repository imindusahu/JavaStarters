public class DoWhileHelloJavaDemo {
    public static void main(String [] args) {
        printHelloJava();
    }

    private static void printHelloJava() {
        int count = 1;

        do {
            System.out.println("Hello Java");
            count++;
        } while(count <= 5);
    }
}

