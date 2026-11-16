import College.Student;

class Student {
    int age = 22;

    static void display() {
        Student s1 = new Student();
        System.out.println("Age is : " + s1.age);
    }
}

public class StaticMethod_AccessInstanceVariable {
    public static void main(String[] args) {
        Student.display();
    }
}
