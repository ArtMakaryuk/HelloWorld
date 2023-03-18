package KataAcademy.basicSyntax.Strings;

public class Ex3 {
    public static void main(String[] args) {
        String s = "   ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String text) {
        boolean is = false;
        String s1 = text.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s1.toLowerCase();
        if (s1.length() == 0) {
            is = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            is = s2.charAt(i) == s2.charAt(s2.length() - i - 1);
        }
        return is;
    }
}
