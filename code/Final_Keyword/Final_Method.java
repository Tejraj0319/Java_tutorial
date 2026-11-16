// package Final_Keyword;

class Parent {
    final void display() {
        System.out.println("I am a parent class...!");
    }
}

class Child extends Parent {
    // YOU CANNOT OVERRIDE FINAL METHOD!

    // void display() {
    // System.out.println("I am a child class...!");
    // }
}

public class Final_Method {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
    }
}
