package Recursion;

public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9, 2, 4 };
        int i = 0;
        System.out.println("this number is at position: " + findLastOccur(arr, i, 2));
    }

    public static int findLastOccur(int arr[], int i, int key) {
        if (i >= arr.length)
            return -1; // base case when we have reached
        // the end of array
        /* else check for the first occurrence */
        int res = findLastOccur(arr, i + 1, key);
        if (res != -1)
            return res; // If there is a match then return it
        else if (arr[i] == key)
            return i; // If this element is our

        return findLastOccur(arr, i + 1, key);
    }
}
