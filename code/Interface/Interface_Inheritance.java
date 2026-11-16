interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    void accelerate();
}

class SportsCar implements Car {
    @Override
    public void start() {
        System.out.println("Car is starting...!");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...!");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.accelerate();
        System.out.println("------------------------------------");
        Car c = new SportsCar();
        c.start();
        c.accelerate();
        System.out.println("------------------------------------");
        Vehicle v = new SportsCar();
        v.start();
        // v.accelerate(); // Not Allowed!
    }
}

// child interface can access the all properties from parent interface, but
// parent interface cannot access any properties from child interface.