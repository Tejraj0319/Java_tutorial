package Abstraction;

abstract class Vehicle {
    // Instance Variable
    String brand;
    
    // Static variable
    static int vahicleCount = 0;
    
    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
        vahicleCount++;
        System.out.println("Vehicle constructor is called...!");
    }

    // Abstract method
    abstract void start();

    // concrete method
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("No of vahicles : " + vahicleCount);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
        System.out.println(brand + " is starting...!");
    }

    // Implementing Abstract Method
    void start(){
        System.out.println("Abstract method called...!");
    }
}

public class Abstract_Class_Constructor_Variables {
    public static void main(String[] args) {
        Car c1 = new Car("BMW M4");
        c1.start();
        c1.display();
        System.out.println("--------------------------------------");
        Car c2 = new Car("Defender");
        c1.start();
        c2.display();
    }
}