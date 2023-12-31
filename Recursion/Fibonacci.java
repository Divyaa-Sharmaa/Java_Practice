package Recursion;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("fib of " + n + "th is: " + fib(n));
        sc.close();
    }

    public static int fib(int n) {
        // if (n == 0 || n == 1) {
        // return n;
        // }
        // int f1 = fib(n - 1);
        // int f2 = fib(n - 2);
        // return f1 + f2;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            n = fib(n - 1) + fib(n - 2);
        }
        return n;
    }

}
