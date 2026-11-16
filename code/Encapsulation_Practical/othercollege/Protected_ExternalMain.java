package othercollege;

import College.Protected_Student;

public class Protected_ExternalMain extends Protected_Student {
    public static void main(String[] args) {
        Protected_ExternalMain obj = new Protected_ExternalMain();
        System.out.println("Marks: " + obj.marks);
        obj.display();
    }
}
