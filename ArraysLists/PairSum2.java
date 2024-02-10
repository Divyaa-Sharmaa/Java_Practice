import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, 20)); 
        System.out.println(pairSum2(list, 20)); 
        // int[] arr = pairsOfSum(list, 11);
        // System.out.println(arr[0] + " , " + arr[1]);   //prints: 1
    }

    //brute force: O(n^2)
    public static boolean pairSum(ArrayList<Integer> list, int sum){
        for(int i = 0; i<list.size();i++){
            for(int j = i+1;j < list.size() ; j++ ){
                if((list.get(i)+list.get(j)) == sum )
                  return true;
            }
        }
        return false;
    }

    //Optimised: O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1; //breaking point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1; // left pointer
        int rp = bp; // right pointer

        while(lp!=bp){
            if(list.get(lp) + list.get(rp)==target)
             return true;

             // case 2
             if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
             }//case 3
             else{
                rp = (n+rp-1)%n;
              }
        }
        return false;
    }
}
