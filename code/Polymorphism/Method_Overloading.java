class Add{
    static void add(int a, int b){
        System.out.println("Sum of two integers(static method): " + (a + b));
    }
    final void add(int a, int b, int c){
        System.out.println("Sum of three integers(final method): " + (a + b + c));
    }
    public void add(double a, double b){
        System.out.println("Sum of two doubles(public method): " + (a + b));
    }
    protected void add(int a, double b){
       System.out.println("Sum of int and double(protected method): " + (a + b));
        add(10.5, 1);
    }
    private void add(double a, int b){
        System.out.println("Sum of double and int(private method): " + (a + b));
    }
}
public class Method_Overloading{
    public static void main(String[] args){
      Add.add(10,5);
      Add a = new Add();
      a.add(5,10,20);
      a.add(10.5, 20.25);
      a.add(5, 20.5);
    }
}