public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            findPermutation(newString, ans + ch);
        }
    }
}
