interface SmartDevice {
    int MAX_VOLUME = 100; // Interface variable (public static final by default)

    void powerOn(); // Abstract method

    default void showStatus() { // Default method
        System.out.println("Device is ready!");
        System.out.println("Maximum Volume: " + MAX_VOLUME);
        logStatus(); // Calling private method
    }

    static void showCategory() { // static method
        System.out.println("Category: Electronic Device");
        displayMessage(); // Calling private static method
    }

    private void logStatus() { // Private method (Java 9 onwards)
        System.out.println("Status checked successfully.");
    }

    private static void displayMessage() { // Private static method (Java 9 onwards)
        System.out.println("Smart Device Information");
    }
}

class SmartPhone implements SmartDevice {
    @Override
    public void powerOn() {
        System.out.println("Smartphone is powering on!");
    }
}

public class Interface_Variables_Methods {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn(); // Calling implemented abstract method
        System.out.println("----------------");
        phone.showStatus(); // Calling default method
        System.out.println("----------------");
        System.out.println("Max Volume: " + SmartDevice.MAX_VOLUME); // Accessing interface variable
        System.out.println("----------------");
        SmartDevice.showCategory(); // Calling static method using interface name
    }
}