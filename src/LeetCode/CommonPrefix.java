package LeetCode;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (Character.toString(strs[i].charAt(i)).equals(Character.toString(strs[j].charAt(j)))) {
                    sb.append(Character.toString(strs[i].charAt(j)));
                }
            }
        }

        return sb.toString();
    }
}
