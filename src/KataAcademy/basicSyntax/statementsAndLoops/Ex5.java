package KataAcademy.basicSyntax.statementsAndLoops;

import java.util.Objects;

public class Ex5 {
    public static void main(String[] args) {
        String day = "Monday";
        System.out.println(isWeekend(day));

    }
    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Sunday") || weekday.equals("Saturday")) {
            return true;
        } else {
            return false;
        }
    }

}
