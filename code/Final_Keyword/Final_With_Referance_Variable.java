class Student {
    String name;
}

public class Final_With_Referance_Variable {
    public static void main(String[] args) {
        final Student s1 = new Student();
        s1.name = "Rajesh";
        System.out.println(s1.name);
        
        // final Student s1 = new Student();   --> Compile time error
    }
}
