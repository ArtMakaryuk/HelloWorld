package Mail;

public class Thief implements MailService {

    private int minValue;
    private int stolenValue;

    public int getStolenValue() {
        return stolenValue;
    }

    public Thief(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            int price = ((MailPackage) mail).getContent().getPrice();
            String content = ((MailPackage) mail).getContent().getContent();
            if (price >= minValue) {
                stolenValue += price;
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + content, 0));
            }

        }
        return mail;
    }
}
