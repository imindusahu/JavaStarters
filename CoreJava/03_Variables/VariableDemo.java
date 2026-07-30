public class VariableDemo {
    public static void main(String[] args) {

        showsVariablesAndDatatypes();

    }


    private static void showsVariablesAndDatatypes(){

        String name = "INDU SAHU";
        int age = 23;
        String college = "SRMCEM, Lucknow";
        double cgpa = 6.9;
        char gender = 'F';
        boolean isPlaced = true; 


        System.out.println("======= STUDENT DETAILS ========");
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("College      : " + college);
        System.out.println("CGPA         : " + cgpa);
        System.out.println("Gender (M/F) : " + gender);
        System.out.println("Is Placed    : " + isPlaced);

    }
}