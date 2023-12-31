package Recursion;

import java.util.*;

public class IsSortedArray {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int size = sc.nextInt();
        int[] arr = new int[size];
        inputArray(arr);
        int i = 0;
        System.out.println("Is the array sorted? " + isSorted(arr, i));
        sc.close();
    }

    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }
}
