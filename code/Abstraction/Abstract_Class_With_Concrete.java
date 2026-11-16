package Abstraction;

abstract class Vehicle {
    abstract void accelerate();

    void start() {
        System.out.println("Starting with fingerprint btn..!");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...!");
    }
}

public class Abstract_Class_With_Concrete {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
        obj.start();
    }
}