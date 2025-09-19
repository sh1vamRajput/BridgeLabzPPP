package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass overriding makeSound
class Dog extends Animal {
    @Override
    void makeSound() {  // Correctly overrides Animal's method
        System.out.println("Dog barks");
    }
}

// Subclass attempting to override with wrong signature
class Cat extends Animal {
    // @Override // Uncommenting this will cause a compile-time error
    void makeSound(String sound) { // Does not match superclass signature
        System.out.println(sound);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Outputs: Dog barks

        Cat myCat = new Cat();
        myCat.makeSound("Meow"); // Works, but this is an overload, not override
    }
}

