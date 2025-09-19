package OOPS.Inheritance.Hybrid_Inheritance;
// Behavior class: Engine
class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

// Behavior class: MusicSystem
class MusicSystem {
    void playMusic() {
        System.out.println("Playing music.");
    }
}

// Main class using composition
class Car {
    private Engine engine;           // has-a relationship
    private MusicSystem musicSystem; // has-a relationship

    Car() {
        engine = new Engine();
        musicSystem = new MusicSystem();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }

    void enjoyMusic() {
        musicSystem.playMusic();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.enjoyMusic();
    }
}

