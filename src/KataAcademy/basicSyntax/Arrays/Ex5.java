package KataAcademy.basicSyntax.Arrays;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 5};
        int[] array2 = {8, 4, 2, 4};
        System.out.println(Arrays.toString(mergeAndSort(array1, array2)));
        Arrays.sort(array1);
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] ans = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            ans[i] = firstArray[i];
            count++;
        }
        for (int j = 0; j < secondArray.length; j++) {
            ans[count++] = secondArray[j];
        }
        count = 0;
        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i] > ans[j]) {
                    count = ans[i];
                    ans[i] = ans[j];
                    ans[j] = count;
                }
            }
        }
        return ans;
    }
}
