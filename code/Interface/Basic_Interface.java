interface Car {
    void start(); 
    void brake();
}
class Ev implements Car{
  @Override
  public void start(){
    System.out.println("Ev starts with button press!");
  }
  @Override
  public void brake(){
    System.out.println("Ev uses regenarative brakes!");
  }
  public void nature(){
    System.out.println("THESE ARE ELECTRIC VEHICLES......!");
  }
}
class FuelCar implements Car{
  @Override
  public void start(){
    System.out.println("FuelCar starts with KEY!");
  }
  @Override
  public void brake(){
    System.out.println("FuelCar uses DISC brakes!");
  }
}
public class Basic_Interface {
    public static void main(String[] args) {
      Ev e1 = new Ev();
      e1.start();
      e1.brake();
      e1.nature();
      System.out.println("------------------------------------------------------------");
      FuelCar e2 = new FuelCar();
      e2.start();
      e2.brake();
    }
}