class Student {
    // Instance variables
    String name;
    int age;
    // Instance method
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
    // Instance method display
    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rajesh", 25);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
