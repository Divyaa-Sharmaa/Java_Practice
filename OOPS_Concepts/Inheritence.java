package OOPS_Concepts;

public class Inheritence {
    public static void main(String[] args) {
        // Inheritance is a concept in Object Oriented Programming where child class is
        // derived from parent class.
        Dog d = new Dog();
        d.eat();
        d.run();
        d.barks();
    }
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }

    void run() {
        System.out.println("running...");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("barking...");
    }
}
