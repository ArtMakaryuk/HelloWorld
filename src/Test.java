import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String h = "Monday";
        System.out.println(checkWeekend(h));
        Box box1 = new Box(10, 10);
        box1.changeWidth(20);
        System.out.println(box1.toString());
        int[] array = {1, 2, 3, 4, 5};
        box1.changeArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static String checkWeekend(String weekday) {
        //Какая-то логика реализованная
        return weekday;
    }


}

class Box {
    int width;
    int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int changeWidth(int width) {
        return this.width = width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

abstract class Cat {
    public static void get() {

    }
}




