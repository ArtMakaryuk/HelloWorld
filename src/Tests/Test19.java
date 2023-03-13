package Tests;

import java.util.Locale;

import java.util.regex.Matcher;
import java.lang.StringBuilder;
import java.util.regex.Pattern;


public class Test19 {
    public static void main(String[] args) {

        String s = "Madam, I'm Adam!";
        String s5 = "Mad!/am, I'm Adam!";
        String s1 = "Madam11, I'm Adam!";
        String s2 = "Madam, I'm Ada!@m!";
        String s3 = "Madaggm, I'm Adam!";
        String s4 = "Madaasdm, I'm Adam!";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
        System.out.println(isPalindrome(s5));
    }

    public static boolean isPalindrome(String text) {
//        String str = text.replaceAll("[^a-zA-Z0-9]", "");
//        StringBuilder builder = new StringBuilder(str);
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
//        return text1.equals(text);
//        builder.reverse();
//        return str.equalsIgnoreCase(builder.toString());

    }
   /*     text.replaceAll(regex, "");
        System.out.println(text);
        StringBuilder text1 = builder.reverse();
        return text1.equals(builder);*/
}