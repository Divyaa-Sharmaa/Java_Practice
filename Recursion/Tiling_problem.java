package Recursion;

import java.util.*;

public class Tiling_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ways for set to tile in 2 x " + n + " is: " + tilingProblem(n));
        sc.close();
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fn1 = tilingProblem(n - 1);
        int fn2 = tilingProblem(n - 2);
        return fn1 + fn2;
    }
}