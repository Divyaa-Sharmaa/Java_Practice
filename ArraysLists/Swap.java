
import java.util.ArrayList;

public class Swap {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(55);
        number.add(43);
        number.add(19);
        number.add(32);
        number.add(68);

        int index1 =1;
        int index2 =3;
        System.out.println("Before swapping: "+ number);
       swap(number,index1, index2);
       System.out.println("After swapping: "+ number);

    }

    public static void swap(ArrayList<Integer> arr,int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
        // System.out.println("The array after swapping is : "+arr);
    }
    
}
