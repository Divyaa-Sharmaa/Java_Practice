package OOPS_Concepts;

public class Inheritence {
    public static void main(String[] args) {
        // Inheritance is a concept in Object Oriented Programming where child class is
        // derived from parent class.
        Dog d = new Dog();
        d.eat();
        // d.run();
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
// class Animal {
// void eat() {
// System.out.println("eating...");
// }

// void run() {
// System.out.println("running...");
// }
// }

// class Mammel extends Animal {
// void walks() {
// System.out.println("walking...");
// }
// }

// class Dog extends Mammel {
// void barks() {
// System.out.println("barking...");
// }
// }

// hierarchical inheritance
// class OtherAnimal {
// int numberOfAnimal;
// }

// class Fish extends OtherAnimal {
// void swim() {
// System.out.println("swimming...");
// }
// }

// class lion extends OtherAnimal {
// void roar() {
// System.out.println("roaring...");
// }
// }

// Hybrid Inheritance
class Animal {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
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

class Car extends Mammel {
    void run() {
        System.out.println("running...");
    }
}

class Fish extends Animal {
    void breatheWater() {
        System.out.println("Fish can Breath Water!");
    }
}

class Shark extends Fish {
    void breatheAir() {
        System.out.println("Shark can't Breath Air!");
    }
}

class whale extends Fish {
    void breatheOxygen() {
        System.out.println("Whale can Breath Oxygen!");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying.");
    }
}

class Peacock extends Bird {
    void showTail() {
        System.out.println("My beautiful tail is showing.");
    }
}
