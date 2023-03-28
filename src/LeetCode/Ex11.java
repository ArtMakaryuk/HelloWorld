package LeetCode;

public class Ex11 {
    public static void main(String[] args) {
        int x = 0;
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.isPalindrome(x));
    }
}

class Solution11 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        boolean foo = false;
        String s1 = sb.reverse().toString();
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
//                i = Integer.MAX_VALUE;
                return false;
            } else {
                foo = true;
            }
        }
        return foo;
    }
}
