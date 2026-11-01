
public class LambdaBasicsDemo {

    public static void main(String[] args) {

        // Traditional approach: Anonymous class
        Runnable traditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        traditional.run();

        // Java 8 approach: Lambda expression
        Runnable lambda = () -> {
            System.out.println("Hello from Lambda Expression");
        };

        lambda.run();

        // Shorter lambda expression
        Runnable shortLambda = () ->
                System.out.println("Hello from Short Lambda");

        shortLambda.run();
    }
}
