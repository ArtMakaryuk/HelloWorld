package LeetCode;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution5 solution = new Solution5();
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
class Solution5 {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int count = ans[0];
        for (int i = 1; i< nums.length;i++) {
            ans[i] = count + nums[i];
            count = ans[i];
        }
        return ans;
    }
}