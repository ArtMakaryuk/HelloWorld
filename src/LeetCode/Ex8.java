package LeetCode;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        String[] garbage = {"MGMGM", "GM", "PM", "P"};
        int[] travel = {3, 5, 5};
        Solution8 solution = new Solution8();
        System.out.println(solution.garbageCollection(garbage, travel));
    }
}

class Solution8 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String[] garbage1 = new String[garbage.length - 1];
        System.arraycopy(garbage, 1, garbage1, 0, garbage.length - 1);

       /* for (int j = 0; j < garbage.length; j++) {
            String garb = garbage[j];
            for (int i = 0; i < garb.length(); i++) {
                if (garb.charAt(i) == 'P') {
                    count++;
                }
            }
            if (Arrays.toString(garbage1).contains("P")) {
                //  if (!garbage[0].equals("P"))
                if (j != 0) {
                    if (j == garbage.length - 1 && !garb.contains("P")) {
                        break;
                    } else {
                        count += travel[j - 1];
                    }
                }
            } else break;
        }*/
        for (int j = 0; j < garbage.length; j++) {
            String garb = garbage[j];
            for (int i = 0; i < garb.length(); i++) {
                if (garb.charAt(i) == 'G') {
                    count++;
                }
            }
            if (j == 0)
                if (Arrays.toString(garbage1).contains("G")) {
                  if (j != 0) {
                     if (j == garbage.length - 1 || !garb.contains("G")) {
                        break;
                    } else {
                        count += travel[j - 1];
                    }
                }
            } else break;
            if (j > 0) {
                String[] aa = new String[garbage.length - j];
                System.arraycopy(garbage, j + 1, aa, 0, garbage.length - j);
                if (Arrays.toString(aa).contains("G")) {
                    if (j != 0) {
                        if (j == garbage.length - 1 || !garb.contains("G")) {
                            break;
                        } else {
                            count += travel[j - 1];
                        }
                    }
                } else break;
            }
        }
        /*for (int j = 0; j < garbage.length; j++) {
            String garb = garbage[j];
            for (int i = 0; i < garb.length(); i++) {
                if (garb.charAt(i) == 'M') {
                    count++;
                }
            }
            if (Arrays.toString(garbage1).contains("M")) {
                if (j != 0) {
                    if (j == garbage.length - 1 && !garb.contains("M")) {
                        break;
                    } else {
                        count += travel[j - 1];
                    }
                }
            } else break;
        }*/
        return count;
    }
}