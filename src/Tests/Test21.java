package Tests;

import java.util.Arrays;

public class Test21 {
    public static void main(String[] args) {
        int[] a1 = {10, 11 ,12};
        int[] a2 = {1, 3, 5};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1.length == 0) {
            return a2;
        }
        else if (a2.length == 0) {
            return a1;
        }
        int[] a3 = new int[a1.length + a2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < a3.length; i++) {
            if (a == a2.length) {
                a3[i] = a1[i - a];
                b++;
            } else if (b == a1.length) {
                a3[i] = a2[i - b];
                a++;
            } else if (a1[i - a] < a2[i - b]) {
                a3[i] = a1[i - a];
                b++;
            } else {
                a3[i] = a2[i - b];
                a++;
            }
        }
        return a3;
    }
}
