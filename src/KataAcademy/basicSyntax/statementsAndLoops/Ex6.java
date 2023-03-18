package KataAcademy.basicSyntax.statementsAndLoops;

public class Ex6 {
    public static void main(String[] args) {
        String day = "Monday";
        System.out.println(checkWeekend(day));
    }

    public static String checkWeekend(String weekday) {
        return weekday == "Sunday" || weekday == "Saturday" ? "Ура, выходной!" : "Надо еще поработать";
    }
}
