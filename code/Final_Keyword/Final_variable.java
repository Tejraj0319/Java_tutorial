// package Final_Keyword;

class Student {
    final int age;

    static final String collegeName = "ZCOER";

    Student(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("Instance Variable Final : " + age);
    }
}

public class Final_variable {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println("Normal class variable: " + PI);

        Student s1 = new Student(21);
        s1.display();

        System.out.println(Student.collegeName);

    }
}
