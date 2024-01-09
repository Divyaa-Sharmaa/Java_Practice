package Recursion;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "appnnacollegee";
        remove_Duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    private static void remove_Duplicates(String s, int index, StringBuilder sb, boolean map[]) {
        if (index == s.length()) {
            System.out.println(sb);
            return;
        }
        char c = s.charAt(index);
        if (map[c - 'a'] == true) {
            remove_Duplicates(s, index + 1, sb, map);
        } else {
            map[c - 'a'] = true;
            remove_Duplicates(s, index + 1, sb.append(c), map);
        }
    }
}
