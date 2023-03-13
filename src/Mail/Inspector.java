package Mail;

import static Mail.Main.BANNED_SUBSTANCE;
import static Mail.Main.WEAPONS;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            String content1 = ((MailPackage) mail).getContent().getContent();
            if (WEAPONS.equals(content1) | BANNED_SUBSTANCE.equals(content1)) {
                throw new IllegalPackageException();
            }
            if (content1.contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}