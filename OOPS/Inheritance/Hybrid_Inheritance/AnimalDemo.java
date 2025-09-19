package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass that truly "is-a" Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Dog's own method
    }
}

