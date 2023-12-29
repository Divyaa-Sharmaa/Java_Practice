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

// single-level inheritance
class Student {
    int name;
    int roll;

    void study() {
        System.out.println("studying...");
    }
}

class Divya extends Student {
    int marks;

    void grade() {
        System.out.println("Grade A");
    }
}

// multi-level inheritance
class Animal {
    void eat() {
        System.out.println("eating...");
    }

    void run() {
        System.out.println("running...");
    }
}

class Mammel extends Animal {
    void walks() {
        System.out.println("walking...");
    }
}

class Dog extends Mammel {
    void barks() {
        System.out.println("barking...");
    }
}

// hierarchical inheritance
class OtherAnimal {
    int numberOfAnimal;
}

class Fish extends OtherAnimal {
    void swim() {
        System.out.println("swimming...");
    }
}

class lion extends OtherAnimal {
    void roar() {
        System.out.println("roaring...");
    }
}
