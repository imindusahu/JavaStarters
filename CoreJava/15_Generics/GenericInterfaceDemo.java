
interface Repository<T> {
    void save(T item);

    T findById(int id);
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

class StudentRepository implements Repository<Student> {
    @Override
    public void save(Student student) {
        System.out.println("Saving: " + student);
    }

    @Override
    public Student findById(int id) {
        return new Student(id, "Indu");
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Repository<Student> repository = new StudentRepository();

        Student student = new Student(1, "Indu");

        repository.save(student);

        Student foundStudent = repository.findById(101);
        System.out.println("Found: " + foundStudent);
    }
}
