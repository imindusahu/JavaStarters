public class StaticVsInstanceMethodDemo {

    // ============================================================
    // STATIC METHOD
    // ============================================================

    static void staticMethod() {

        System.out.println("This is a static method.");

    }


    // ============================================================
    // INSTANCE METHOD
    // ============================================================

    void instanceMethod() {

        System.out.println("This is an instance method.");

    }


    public static void main(String[] args) {

        System.out.println("========= STATIC METHOD =========");

        // Calling static method directly
        staticMethod();

        // Calling static method using class name
        StaticVsInstanceMethodDemo.staticMethod();


        System.out.println("\n========= INSTANCE METHOD =========");

        // Creating object
        StaticVsInstanceMethodDemo obj =
                new StaticVsInstanceMethodDemo();

        // Calling instance method using object
        obj.instanceMethod();

    }
}