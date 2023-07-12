import java.util.concurrent.Callable;

public class Ships {
    public static void main(String[] args) {
        int[][] field = new int[][] {
                {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        };
        System.out.println(countShips(field));
    }

    public static int countShips(int[][] field) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == 1 && (i == 0 || field[i - 1][j] == 0) && (j == 0 || field[i][j - 1] == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
