package LeetCode.Arrays;

import java.util.Arrays;

public class Ex1_1 {
    public static void main(String[] args) {
        int[] nums = {1};
        Solution1_1 solution1_1 = new Solution1_1();
        System.out.println(Arrays.toString(solution1_1.leftRigthDifference(nums)));
    }

    static class Solution1_1 {
        public int[] leftRigthDifference(int[] nums) {
            int[] leftSum = new int[nums.length];
            int[] rightSum = new int[nums.length];
            int[] answer = new int[nums.length];
            int count = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                count = nums.length - 1;
                if (i == nums.length - 1) {
                    rightSum[i] = 0;
                } else {
                    do {
                        rightSum[i] += nums[count];
                        count--;
                    } while (count > i);
                }
            }
            for (int i = 0; i < nums.length; i++) {
                count = 0;
                if (i == 0) {
                    leftSum[i] = 0;
                } else {
                    do {
                        leftSum[i] += nums[count];
                        count++;
                    } while (count < i);
                }

            }
            for (int i = 0; i < nums.length; i++) {
                    answer[i] = Math.abs(leftSum[i]-rightSum[i]);
            }
            return answer;
        }
    }

}
