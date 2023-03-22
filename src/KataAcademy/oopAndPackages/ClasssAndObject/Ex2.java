package KataAcademy.oopAndPackages.ClasssAndObject;

public class Ex2 {
    public static void main(String[] args) {
        Day current = Day.SATURDAY;
        System.out.println(current.getRusName());
        System.out.println(current.isWeekend());
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SUNDAY || this == SATURDAY;
    }

    public String getRusName() {
        if (this == MONDAY) {
            return "Понедельник";
        } else if (this == TUESDAY) {
            return "Вторник";
        } else if (this == WEDNESDAY) {
            return "Среда";
        } else if (this == THURSDAY) {
            return "Четверг";
        } else if (this == FRIDAY) {
            return "Пятница";
        } else if (this == SATURDAY) {
            return "Суббота";
        } else {
            return "Воскресенье";
        }
    }
}
