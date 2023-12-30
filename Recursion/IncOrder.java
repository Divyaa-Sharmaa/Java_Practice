package Recursion;

import java.util.Scanner;

public class IncOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        IncreaseOrder(n, a);
        sc.close();
    }

    public static void IncreaseOrder(int n, int a) {
        if (n == a) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " ");
        IncreaseOrder(n, a + 1);
    }
}
