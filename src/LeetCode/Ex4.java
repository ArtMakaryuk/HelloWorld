package LeetCode;

public class Ex4 {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.finalValueAfterOperations(operations));
    }
}


class Solution4 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String at : operations) {
            if (at.contains("--X") || at.contains("X--")){
                x--;
            }
            else {
                x++;
            }
        }
        return x;
    }
}