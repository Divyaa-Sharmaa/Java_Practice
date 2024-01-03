package Recursion;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(n + "th power of " + x + " is: " + pow(x, n));
        sc.close();
    }

    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * pow(x, n - 1);
    }
}
