package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
abstract class Animal {
    abstract void makeSound(); // Polymorphic method
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();

        // Polymorphic behavior
        myAnimal1.makeSound(); // Outputs: Dog barks
        myAnimal2.makeSound(); // Outputs: Cat meows

        // Array of superclass references
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal a : animals) {
            a.makeSound(); // Each object responds according to its subclass
        }
    }
}

