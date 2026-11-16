package Abstraction;

abstract class Vehicle {
    // Abstract method (implementation hidden)
    abstract void accelerate();

}
class Car extends Vehicle {
    // Providing implementation of abstract method
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}
public class Basic_Abstract_Class {
    public static void main(String[] args) {

        // Vehicle obj = new Vehicle(); // Not allowed
        Car obj = new Car();
        obj.accelerate();

    }
}

// Very Imp:
// - When abstract method exists: 
// Car must implement accelerate() because it inherits the abstract method from Vehicle.
// - When abstract method is commented: 
// Car still has its own accelerate() method, so it works independently.