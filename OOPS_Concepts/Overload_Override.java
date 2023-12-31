package OOPS_Concepts;
// import java.util.*;;

public class Overload_Override {
    public static void main(String[] args) {
        // Calc newCalc = new Calc(); // Method Overloading
        // System.out.println(newCalc.sum(5, 7));
        // System.out.println(newCalc.sum(8, 9, 10));
        Dog d = new Dog(); // Method Overriding
        d.runs();
    }
}

// Method Overloading
class Calc {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class Animal {
    void runs() {
        System.out.println("running...");
    }
}

class Dog extends Animal {
    void runs() {
        System.out.println("runs fast...");
    }
}
