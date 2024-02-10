import java.util.*;

public class MaximumNum {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(55);
        number.add(43);
        number.add(19);
        number.add(32);
        number.add(68);

        // Complexity = O(n)
        int max =  Integer.MIN_VALUE;
        // for (int i : number) {
        //     if(i> max)
        //      max = i;
        // }

        //2nd way:
        for(int i=0;i<number.size();i++){
            // if(max<number.get(i)){
            //     max =  number.get(i);
            // }
             //  3rd way:
            max= Math.max(max, number.get(i));
        } 

        System.out.println("The maximum value is " +max );
    }

}
