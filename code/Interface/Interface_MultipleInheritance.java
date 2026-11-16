interface AirBag {
    // abstract method
    void openAirBag();
}

interface SoundSystem {
    // abstract method
    void playMusic();
}

class Car implements AirBag, SoundSystem {
    @Override
    public void openAirBag() {
        System.out.println("AirBag opens less than 1 sec...!");
    }

    @Override
    public void playMusic() {
        System.out.println("Music started...!");
    }
}

public class Interface_MultipleInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.openAirBag();
        c1.playMusic();
        System.out.println("-----------------------------------------");
        // Interface reference for same object
        AirBag a = c1;
        a.openAirBag();
        SoundSystem s = c1;
        s.playMusic();
    }
}