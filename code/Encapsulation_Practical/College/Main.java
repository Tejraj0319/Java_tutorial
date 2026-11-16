package College;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        // It can be access from anywhere
        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.display();
    }
}


// to run compile first : javac -d . Encapsulation_Practical\College\Student.java Encapsulation_Practical\College\Main.java
// then run sourcecode containing main : java College.Main 

// -d : Specifies where compiled .class files should be stored.
// . : current directory. 