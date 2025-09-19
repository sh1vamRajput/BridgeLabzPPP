package OOPS.Inheritance.Basic_Inheritance;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps: Tweet!");
    }
}

public class AnimalHierarchyTest {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Cat("Whiskers", 2),
            new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.makeSound(); 
        }
    }
}
