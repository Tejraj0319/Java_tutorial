// package Final_Keyword;

final class Parent {
    final void display() {
        System.out.println("I am a parent class...!");
    }
}

// class Child extends Parent {}

public class Final_Class {
    public static void main(String[] args) {
        // Child c1 = new Child();
        // c1.display();

        Parent p1 = new Parent();
        p1.display();
    }
}
