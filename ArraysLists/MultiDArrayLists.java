import java.util.*;

public class MultiDArrayLists {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // list1.add(1); list1.add(2); list1.add(3);
        // list1.add(4); list1.add(5);
        // list2.add(2); list2.add(4); list2.add(6);
        // list2.add(8); list2.add(10);
        // list3.add(3); list3.add(6); list3.add(9);
        // list3.add(12); list3.add(15);
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        list2.remove(2);
        list3.remove(3);
        list3.remove(2);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);


        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j = 0; j<currentList.size();j++){
                System.out.print(currentList.get(j) + " ");
            }System.out.println("");
        }
        System.out.println("mainList: "+ mainList);
    }
    
}
