// package Static_Keyword;

class Student {
    int age;
    String name;
    static String schoolName = "Maharaja Sayajirao Vidyalaya satara....!";

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("schoolName: " + schoolName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(18, "Ramesh");
        s1.display();
    }
}