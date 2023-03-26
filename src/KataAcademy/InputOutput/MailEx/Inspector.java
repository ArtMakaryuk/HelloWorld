package KataAcademy.InputOutput.MailEx;

import static Mail.Main.BANNED_SUBSTANCE;
import static Mail.Main.WEAPONS;

public class Inspector implements MailService{
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            String content = ((MailPackage) mail).getContent().getContent();
            if (WEAPONS.equals(content) | BANNED_SUBSTANCE.equals(content)) {
                throw new IllegalPackageException();
            }
            if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
