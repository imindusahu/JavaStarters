public class PassByValueDemo {

    static void changeValue(int number) {

        number = 100;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Before method call: " + number);

        changeValue(number);

        System.out.println("After method call: " + number);
    }
}