package LeetCode;

public class Ex2 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.defangIPaddr(address));
    }
}


class Solution2 {
    public String defangIPaddr(String address) {
        String ans = address.replace(".","[.]");
        return ans;
    }
}