package KataAcademy.basicSyntax.primitiveTypes;

public class Ex2 {
    public static void main(String[] args) {
        int monitors = 10;
        int programmers = 8;
        int answer = drawisMonitorsCounter(monitors, programmers);
        System.out.println(answer);
    }
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}
