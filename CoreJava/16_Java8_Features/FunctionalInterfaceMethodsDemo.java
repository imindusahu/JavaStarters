
@FunctionalInterface
interface Vehicle {

    // Only abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped");
    }

    // Static method
    static void service() {
        System.out.println("Vehicle servicing");
    }
}

public class FunctionalInterfaceMethodsDemo {

    public static void main(String[] args) {

        Vehicle car = () ->
                System.out.println("Car started");

        car.start();
        car.stop();

        Vehicle.service();
    }
}
