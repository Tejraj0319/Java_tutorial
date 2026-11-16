class Student {
    // Instance var
    String name;
    int age;

    // private constructor
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
     static void createObject() {
        Student s1 = new Student("Rajesh", 25);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

public class Private_Constructor {
    public static void main(String[] args) {
        Student.createObject();
    }
}
