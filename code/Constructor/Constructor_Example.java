class Student {
    // Instance var
    String name;
    int age;

    // constructor (Parameterized Constructor)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance Method
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor_Example {
    public static void main(String[] args) {
        Student s1 = new Student("Rajesh", 25);
        s1.display();
    }
}