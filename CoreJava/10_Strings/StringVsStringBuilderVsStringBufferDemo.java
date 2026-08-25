public class StringVsStringBuilderVsStringBufferDemo {

    public static void main(String[] args) {

        System.out.println("\n========= STRING ==========\n");

        String str = "Java";

        str = str + " Backend";
        str = str + " Developer";

        System.out.println("String: " + str);


        System.out.println("\n========= STRINGBUILDER ==========\n");

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" Backend");
        builder.append(" Developer");

        System.out.println("StringBuilder: " + builder);


        System.out.println("\n========= STRINGBUFFER ==========\n");

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Backend");
        buffer.append(" Developer");

        System.out.println("StringBuffer: " + buffer);
    }
}