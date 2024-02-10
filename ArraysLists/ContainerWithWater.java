import java.util.ArrayList;

public class ContainerWithWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Container with most water: " + maxArea(height));
        System.out.println("Container with most water with optimized solution: " + storeWater(height));
    }
    public static int maxArea(ArrayList<Integer> height) {
        int maxArea = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currArea = ht*width;
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int i =height.get(0);
        int j = height.size()-1;
        while(i<j){
            int ht = Math.min(height.get(i),height.get(j));
            int width = j-i;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            if (height.get(i) < height.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}
