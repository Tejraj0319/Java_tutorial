// package Static_Keyword;

class Calculator {
    static class addition {
        static int a = 20;
        static int b = 11;

        // static void add() {
        // System.out.println("Addition is: " + (a + b));
        // }
        void add() {
            System.out.println("Addition is: " + (a + b));
        }
    }
}

public class Static_Nested_Class {
    public static void main(String[] args) {
        Calculator.addition obj = new Calculator.addition();
        obj.add();
        // Calculator.addition.add();
    }
}