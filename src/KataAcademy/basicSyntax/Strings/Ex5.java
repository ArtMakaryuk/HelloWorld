package KataAcademy.basicSyntax.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        String email = "@outlook.com";
        System.out.println(isGmailOrOutlook(email));
    }
    public static boolean isGmailOrOutlook(String email) {
        String regex = "\\w{1,}@(gmail.com|outlook.com)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

