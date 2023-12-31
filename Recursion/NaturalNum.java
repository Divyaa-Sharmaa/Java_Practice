package Recursion;

import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of natural numbers (" + n + ") is: " + sumOfNNaturalNum(n));
        sc.close();
    }

    public static int sumOfNNaturalNum(int n) {
        if (n == 1) {
            return 1;
        } else {
            n = n + sumOfNNaturalNum(n - 1);
        }
        return n;
    }
}
