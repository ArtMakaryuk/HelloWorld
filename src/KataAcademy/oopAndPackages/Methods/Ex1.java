package KataAcademy.oopAndPackages.Methods;

import java.util.Objects;

public class Ex1 {
    public static void main(String[] args) {
        String day = "Sunday";
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekdayCount(days));
        System.out.println(isWeekend(day));
    }
    public static boolean isWeekend(String dayName) {
        return ("Sunday").equalsIgnoreCase(dayName) || ("Saturday").equalsIgnoreCase(dayName);
    }
    public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
                count++;
            }
        }
        return count;
    }
    public static int weekdayCount(String[] days) {
        return days.length - weekendCount(days);
    }
}
