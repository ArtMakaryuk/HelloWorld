import java.util.HashMap;
import java.util.Map;

public class LengthOfString {

    public static void main(String[] args) {
        String s = "vrevwazvweewvewvwe";
        System.out.println(length(s));

    }
    public static int length(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!sb.toString().contains(Character.toString(s.charAt(i)))) {
                sb.append(s.charAt(i));
            } else {
                s = s.substring(1, s.length());
                sb = new StringBuilder(Character.toString(s.charAt(0)));
                i = 0;
            }
            if (sb.length() > count) {
                count = sb.length();
            }
        }
        return count;
    }
//    public static int lengthMap(String s) {
//        int start = 0;
//        int maxLength = 0;
//
//        Map<Character, Integer> processedChars = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            processedChars.put(c, i);
//        }
//    }
    public static int length2(String s) {
        int count = 0;
        String a = "";
        for (int i = 0; i < s.length(); i++) {

            if (!a.contains(Character.toString(s.charAt(i)))) {
                a = Character.toString(s.charAt(i)) + a;
            } else {
                a = Character.toString(s.charAt(i));
            }
            if (a.length() > count) {
                count = a.length();
            }
        }
        return count;
    }
}
