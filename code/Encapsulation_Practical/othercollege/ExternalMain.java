package othercollege;

import College.Student;

public class ExternalMain {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Accessing public variables
        System.out.println(s1.name);
        System.out.println(s1.age);

        // Accessing public method
        s1.display();
    }
}