package LeetCode;

public class Ex6 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        Solution6 solution = new Solution6();
        System.out.println(solution.numJewelsInStones(jewels,stones));
    }
}
class Solution6 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewels.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}