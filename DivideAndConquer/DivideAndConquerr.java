package DivideAndConquer;

public class DivideAndConquerr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2};
        int si = 0;
        int ei = arr.length - 1;
        int target = 5;
        int index = rotatedSortedArray(arr,target, si, ei);
        System.out.println("target at index is: " + index);
    }

    public static int rotatedSortedArray(int[] arr, int target,int si,int ei){
        if (si > ei) return -1;

        int mid = si + (ei-si)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }

        if(arr[si]<= arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return rotatedSortedArray(arr,target,si,mid-1);
            }else{
                return rotatedSortedArray(arr, target, mid+1,ei);
            }
        }else{
            if(arr[ei]>=target && target >= arr[mid]){
                return rotatedSortedArray(arr,target,mid+1,ei);
            }else{
                return rotatedSortedArray(arr,target,si,mid-1);
            }    
        }



    }
}
