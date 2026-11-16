class Parent {
    Parent() {
        System.out.println("This is Parent constructor!");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("This is Child constructor!");
    }
}

public class Constructor_Chaining_with_super {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
