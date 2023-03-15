package JavaBlackBelt.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int res = Arrays.stream(array).filter(n -> n % 2 != 0)
                .map(operand ->
                {
                    if (operand % 3 == 0) {
                        operand = operand / 3;
                    }
                    return operand;
                }).
                reduce((a, e) -> a + e).getAsInt();
        System.out.println(res);
    }
}
