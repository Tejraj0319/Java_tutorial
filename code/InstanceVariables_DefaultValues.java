class InstanceVariables{
  byte byteValue;
  short shortValue;
  int intValue;
  long longValue;
  float floatValue;
  double doubleValue;
  char charValue;
  boolean booleanValue;
  String  name;

  // instance method 
  void display(){
    System.out.println("Byte: "+ byteValue);
      System.out.println("short: "+ shortValue);
      System.out.println("int: "+ intValue);
      System.out.println("long: "+ longValue);
      System.out.println("float: "+ floatValue);
      System.out.println("double: "+ doubleValue);
      System.out.println("char: "+ (int)charValue);
      System.out.println("boolean: "+ booleanValue);
      System.out.println("String: "+ name);
  }
}
public class InstanceVariables_DefaultValues{
    public static void main(String[] args){
      InstanceVariables I1= new InstanceVariables();
      I1.display();
    }
}