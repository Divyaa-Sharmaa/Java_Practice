import java.util.ArrayList;

public class PairSum1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list, 3)); 
        int[] arr = pairsOfSum(list, 11);
        System.out.println(arr[0] + " , " + arr[1]);   //prints: 1
    }
    //brute force: O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list, int sum){
    //     for(int i = 0; i<list.size();i++){
    //         for(int j = i+1;j < list.size() ; j++ ){
    //             if((list.get(i)+list.get(j)) == sum )
    //               return true;
    //         }
    //     }
    //     return false;
    // }

     // optimised - using 2 pointers - return a boolean value - O(n)
    public static boolean pairSum(ArrayList<Integer> list, int sum){
        int i = 0;
        int j = list.size()-1;
        while(i!=j){
            if(list.get(i)+list.get(j)==sum)
              return true;
            else if(list.get(i)+list.get(j)>=sum){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    //optimized - using 2 pointers - return an array - O(n)
    public static int[] pairsOfSum(ArrayList<Integer> list, int target){
        int i = 0;
        int j = list.size()-1;
        while(i!=j){
            if(list.get(i)+list.get(j)==target)
               return new int[]{list.get(i), list.get(j)};
            else if(list.get(i)+list.get(j)>=target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}
