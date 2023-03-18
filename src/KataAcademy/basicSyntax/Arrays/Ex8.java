package KataAcademy.basicSyntax.Arrays;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        int[] array1 = {};
        int[] array2 = {0};
        System.out.println(Arrays.toString(mergeAndSort(array1, array2)));
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] ans = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, ans, 0, firstArray.length);
        System.arraycopy(secondArray, 0, ans, firstArray.length, secondArray.length);
        Arrays.sort(ans);
        return ans;
    }
}
