package LeetCode;

import java.util.Arrays;

public class Ex0 {
    public static void main(String[] args) {
        double celsius = 36.50;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.convertTemperature(celsius)));
    }
}


class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = {celsius + 273.15, celsius * 1.80 + 32.00};
        return ans;
    }
}