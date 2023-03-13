package LeetCode;

public class Ex7{
    public static void main(String[] args) {
        int n = 99;
        Solution7 solution = new Solution7();
        System.out.println(solution.smallestEvenMultiple(n));
    }
}
class Solution7 {
    public int smallestEvenMultiple(int n) {
        int ans = n;
        while (ans%2 != 0 && ans%n == 0) {
            ans += n;
        }
        return ans;
    }

}