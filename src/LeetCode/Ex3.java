package LeetCode;

public class Ex3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution3 ans = new Solution3();
        System.out.println(ans.lengthOfLongestSubstring(s));
    }
}

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int a = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                for (int k = 0; k < sb.length(); k++) {
                    if (sb.charAt(k) == s.charAt(j)) {
                        break;
                    } else if (k==j){
                        sb.append(s.charAt(j));
                    }
                }
            }
            if (sb.length() > a) {
                a = sb.length();
            }
            sb.setLength(0);
        }
        return a;
    }
}