package KataAcademy.basicSyntax.Strings;

public class Ex3 {
    public static void main(String[] args) {
        String s = "   ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return str.equalsIgnoreCase(builder.toString());
    }
}
