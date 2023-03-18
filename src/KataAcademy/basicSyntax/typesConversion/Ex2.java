package KataAcademy.basicSyntax.typesConversion;

public class Ex2 {
    public static void main(String[] args) {
        byte age1 = 15;
        byte age2 = 42;
        byte ans = getAgeDiff(age1, age2);
        System.out.println(ans);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}
