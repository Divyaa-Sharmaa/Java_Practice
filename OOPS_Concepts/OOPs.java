package OOPS_Concepts;

public class OOPs {
    public static void main(String[] args) {
        // Constructors
        Person p2 = new Person("Divya", 12);
        System.out.println("name: " + p2.name);
    }
}

class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

}
