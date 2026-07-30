public class AssignmentDemo {

    public static void main(String [] args) {
        showsAssignmentOperators();
    }

    
    private static void showsAssignmentOperators() {
        int marks = 80;   
   
        System.out.println("========== ASSIGNMENT OPERATORS ==========\n");

        System.out.println(marks += 10);
        System.out.println(marks -= 5);
        System.out.println(marks *= 2);
        System.out.println(marks /= 4);
        System.out.println();
    }

}