public class StringPerformanceDemo {

    public static void main(String[] args) {

        System.out.println("\n========= STRING VS STRINGBUILDER PERFORMANCE ==========\n");

        int count = 100000;

        // ============================================================
        // String concatenation
        // ============================================================

        long startString = System.nanoTime();

        String text = "";

        for (int i = 0; i < count; i++) {

            text += i;
        }

        long endString = System.nanoTime();

        long stringTime = endString - startString;


        // ============================================================
        // StringBuilder
        // ============================================================

        long startBuilder = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {

            builder.append(i);
        }

        long endBuilder = System.nanoTime();

        long builderTime = endBuilder - startBuilder;


        // ============================================================
        // Results
        // ============================================================

        System.out.println("String time: " + stringTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");

        System.out.println("\nStringBuilder is generally faster for repeated modifications.");
    }
}