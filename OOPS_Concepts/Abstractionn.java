package OOPS_Concepts;

public class Abstractionn {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.eat();
        // d.walk();

        Puppy p = new Puppy();
        p.eat();
        p.walk();

    }
}

abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called...");
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called...");
    }

    void walk() {
        System.out.println("Dog is walking on four legs.");
    }
}

class Puppy extends Dog {
    Puppy() {
        System.out.println("Puppy constructor called...");
    }

    void walk() {
        System.out.println("Puppy is crawling.");
    }
}
