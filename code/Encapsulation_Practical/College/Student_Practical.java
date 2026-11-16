package College;
// package code.Encapsulation_Practical.college;

import Student;

class Student {
    // Private variables
    private String name;
    private int age;

    // read-only property(provide getter no setter)
    private String collegeName = "ZCOER";

    public String getCollegeName() {
        return collegeName;
    }

    // write-only property(provide setter no getter)
    private String password;

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password set successfully...!");
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setters
    public void setAge(int age) {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Student_Practical {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rajesh");
        s1.setAge(24);
        s1.setPassword("abc@12345");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("College Name: " + s1.getCollegeName());
    }
}
