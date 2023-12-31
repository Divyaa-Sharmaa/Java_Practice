package Recursion;

import java.util.Scanner;

public class IncOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = 1;
        // IncreaseOrder(n, a);
        printInc(n);
        sc.close();
    }

    // 1st way to do this
    public static void IncreaseOrder(int n, int a) {
        if (n == a) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " ");
        IncreaseOrder(n, a + 1);
    }

    // 2nd way to do this
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printInc(n - 1);
        System.out.print(" " + n);
    }
}
