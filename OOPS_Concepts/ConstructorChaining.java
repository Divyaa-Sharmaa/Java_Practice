package OOPS_Concepts;

public class ConstructorChaining {
    public static void main(String[] args) {
        new Temp();
        new Derived("Divya");
    }
}

// 1. Within the class
class Temp {

    Temp() {
        this(6);
        System.out.println("This is a default constructor");
    }

    Temp(int x) {
        this(5, 25);
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x * y);
    }
}

// 2. From base class using super keyword

class Base {
    String name;

    Base() {
        this(" ");
        System.out.print("default base constructor...");
    }

    Base(String name) {
        this.name = name;
        System.out.println("paramerterized base constructor..." + name);
    }
}

class Derived extends Base {
    Derived() {
        super(" ");
        System.out.println("default derived constructor...");
    }

    Derived(String name) {
        super(name);
        System.out.println("paramerterized derived constructor...");
    }
}
