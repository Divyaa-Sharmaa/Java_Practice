public class Subsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }

    public static void findSubsets(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }

            return;
        }
        findSubsets(str, i + 1, ans + str.charAt(i));
        findSubsets(str, i + 1, ans);
    }

    }
