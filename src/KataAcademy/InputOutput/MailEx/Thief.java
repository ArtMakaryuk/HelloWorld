package KataAcademy.InputOutput.MailEx;

public class Thief implements MailService {
    private int minValue;
    private int stolenValue;

    public Thief(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package content = ((MailPackage) mail).getContent();
            int price = content.getPrice();
            if (price > minValue) {
                stolenValue += price;
                mail = new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of " + content.getContent(), 0));
            }
        }
        return mail;
    }

    public int getStolenValue() {
        return stolenValue;
    }
}
