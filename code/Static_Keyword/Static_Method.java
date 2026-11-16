// package Static_Keyword;

class Calculator {
    static int a = 20;
    static int b = 11;

    // static method
    static void add() {
        System.out.println("Addition is: " + (a + b));
    }
}

public class Static_Method {
    public static void main(String[] args) {
        Calculator.add();
    }
}
