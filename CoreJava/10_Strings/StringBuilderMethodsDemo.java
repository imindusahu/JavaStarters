public class StringBuilderMethodsDemo {

    public static void main(String[] args) {

        System.out.println("\n========= STRINGBUILDER METHODS ==========\n");


        // ============================================================
        // 1. append()
        // ============================================================
        // Adds data at the end of the StringBuilder.

        StringBuilder sb1 = new StringBuilder("Java");

        sb1.append(" Backend");

        System.out.println("1. append()");
        System.out.println("Result: " + sb1);


        // ============================================================
        // 2. insert()
        // ============================================================
        // Inserts data at the specified index.
        // Index 4 comes after "Java".

        StringBuilder sb2 = new StringBuilder("Java");

        sb2.insert(4, " Backend");

        System.out.println("\n2. insert()");
        System.out.println("Result: " + sb2);


        // ============================================================
        // 3. delete()
        // ============================================================
        // Deletes characters from start index to end index.
        // endIndex is EXCLUSIVE.

        StringBuilder sb3 = new StringBuilder("Java Backend");

        sb3.delete(4, 12);

        System.out.println("\n3. delete()");
        System.out.println("Result: " + sb3);


        // ============================================================
        // 4. deleteCharAt()
        // ============================================================
        // Deletes exactly ONE character at the specified index.

        StringBuilder sb4 = new StringBuilder("Java");

        sb4.deleteCharAt(3);

        System.out.println("\n4. deleteCharAt()");
        System.out.println("Result: " + sb4);


        // ============================================================
        // 5. replace()
        // ============================================================
        // Replaces characters from start index to end index.
        // endIndex is EXCLUSIVE.

        StringBuilder sb5 = new StringBuilder("Java Backend");

        sb5.replace(0, 4, "Python");

        System.out.println("\n5. replace()");
        System.out.println("Result: " + sb5);


        // ============================================================
        // 6. reverse()
        // ============================================================
        // Reverses the entire StringBuilder.

        StringBuilder sb6 = new StringBuilder("Java");

        sb6.reverse();

        System.out.println("\n6. reverse()");
        System.out.println("Result: " + sb6);


        // ============================================================
        // 7. charAt()
        // ============================================================
        // Returns the character at the specified index.
        //
        // Java
        // 0123
        // Index 2 = 'v'

        StringBuilder sb7 = new StringBuilder("Java");

        char character = sb7.charAt(2);

        System.out.println("\n7. charAt()");
        System.out.println("Character at index 2: " + character);


        // ============================================================
        // 8. setCharAt()
        // ============================================================
        // Changes the character at the specified index.

        StringBuilder sb8 = new StringBuilder("Java");

        sb8.setCharAt(0, 'K');

        System.out.println("\n8. setCharAt()");
        System.out.println("Result: " + sb8);


        // ============================================================
        // 9. length()
        // ============================================================
        // Returns the number of characters in the StringBuilder.

        StringBuilder sb9 = new StringBuilder("Java Backend");

        System.out.println("\n9. length()");
        System.out.println("Length: " + sb9.length());


        // ============================================================
        // 10. capacity()
        // ============================================================
        // Returns the current capacity of the StringBuilder.
        //
        // new StringBuilder("Java")
        //
        // Default capacity = 16
        // "Java" length = 4
        //
        // Initial capacity = 16 + 4 = 20

        StringBuilder sb10 = new StringBuilder("Java");

        System.out.println("\n10. capacity()");
        System.out.println("Length: " + sb10.length());
        System.out.println("Capacity: " + sb10.capacity());
    }
}