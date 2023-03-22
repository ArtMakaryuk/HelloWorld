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
            return "�����������";
        } else if (this == TUESDAY) {
            return "�������";
        } else if (this == WEDNESDAY) {
            return "�����";
        } else if (this == THURSDAY) {
            return "�������";
        } else if (this == FRIDAY) {
            return "�������";
        } else if (this == SATURDAY) {
            return "�������";
        } else {
            return "�����������";
        }
    }
}
