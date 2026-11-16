class Student {
    // Default constructor
    Student() {
        this(101);
        System.out.println("Default constructor!");
    }

    // Single parameterized constructor
    Student(int id) {
        this(101, "Rajesh");
        System.out.println("Single parameterized constructor!");
    }

    // Double parameterized constructor
    Student(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Constructor_Chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
