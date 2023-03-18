package KataAcademy.basicSyntax.statementsAndLoops;

public class Ex3 {
    public static void main(String[] args) {
        int age = 6;
        System.out.println(determineGroup(age));
    }
    public static int determineGroup(int age) {
        if (age <= 13 && age >= 7) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else return -1;
    }
}
