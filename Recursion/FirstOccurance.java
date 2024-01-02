package Recursion;

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9, 2, 4 };
        int i = 0;
        System.out.println("this number is at position: " + findFirstOccur(arr, i, 7));
    }

    public static int findFirstOccur(int[] arr, int i, int key) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return findFirstOccur(arr, i + 1, key);
    }
}
