class Student {

    String name;
}


public class ObjectPassByValueDemo {

    static void changeName(Student student) {

        student.name = "Rahul";

    }


    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Indu";

        System.out.println("Before method call: " + s.name);

        changeName(s);

        System.out.println("After method call: " + s.name);
    }
}