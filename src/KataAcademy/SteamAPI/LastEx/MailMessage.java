package KataAcademy.SteamAPI.LastEx;

public class MailMessage extends Abstraction<String> {
    MailMessage(String to, String from, String content) {
        super(to, from, content);
    }
}