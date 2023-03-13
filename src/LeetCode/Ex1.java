package LeetCode;

public class Ex1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.numIdenticalPairs(nums));
    }
}


class Solution1 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0;i<nums.length;i++) {
            for (int j=1;j<nums.length;j++) {
                if (nums[i] == nums[j] && j>i) {
                    count++;
                }
            }
        }
        return count;
    }
}