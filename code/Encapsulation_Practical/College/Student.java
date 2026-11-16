package College;

public class Student {
    // private String name = "Rajesh"; // cannot access outside the class.(Try it)
    // String name = "Rajesh"; // It will also run
    public String name = "Rajesh";
    public int age = 25;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
