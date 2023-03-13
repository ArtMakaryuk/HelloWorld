package LeetCode;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        String[] garbage1 = new String[garbage.length-1];
        System.arraycopy(garbage,1,garbage1,0,garbage.length-1);
        System.out.println(Arrays.toString(garbage1));
    }
}
