// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(5);

        System.out.println("size is: " + list.size()); // 5
        // print elements:
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n******************");
        // print in reverse elements
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        // sorting the arraylist using Collections.sort method
        System.out.print("\n before sorting: " + list);
        Collections.sort(list); // ascending order
        System.out.println(" after sorting: " + list + "\n");
        // for sorting in descending order:
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("after sorting in descending order: " + list);
    }
}
