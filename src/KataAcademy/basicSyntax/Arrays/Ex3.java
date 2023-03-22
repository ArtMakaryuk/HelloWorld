package KataAcademy.basicSyntax.Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
//new int[2]
public class Ex3 {
    public static void main(String[] args) {
        int[] numbers = {};
        System.out.println(Arrays.toString(getArrayMiddle(numbers)));
    }
    public static int[] getArrayMiddle(int[] numbers) {
        int[] ans;
        if (numbers.length != 0) {
            if (numbers.length % 2 == 0) {
                ans = new int[] {numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]};
            } else {
                ans = new int[] {numbers[numbers.length / 2]};
            }
            return ans;
        } else {
            return new int[0];
        }
    }
}
