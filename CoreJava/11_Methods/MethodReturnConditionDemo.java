public class MethodReturnConditionDemo {

    // Returns the larger of two numbers
    static int findMaximum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    // Returns true if the number is positive
    static boolean isPositive(int number) {

        if (number > 0) {
            return true;
        }

        return false;
    }


    // Returns grade based on marks
    static char calculateGrade(int marks) {

        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }


    public static void main(String[] args) {

        System.out.println("========= MAXIMUM =========");

        int maximum = findMaximum(50, 80);

        System.out.println("Maximum: " + maximum);


        System.out.println("\n========= POSITIVE CHECK =========");

        boolean positive = isPositive(25);

        System.out.println("Is Positive: " + positive);


        System.out.println("\n========= GRADE =========");

        char grade = calculateGrade(82);

        System.out.println("Grade: " + grade);
    }
}