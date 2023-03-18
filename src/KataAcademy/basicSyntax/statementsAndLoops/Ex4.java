package KataAcademy.basicSyntax.statementsAndLoops;

public class Ex4 {
    public static void main(String[] args) {
        String day = "Tuesday";
        System.out.println(isWeekend(day));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Monday":
            case "Wednesday":
            case "Tuesday":
            case "Thursday":
            case "Friday":
                return false;
            case "Saturday":
            case "Sunday":
                return true;
        }
        return false;
    }
}
