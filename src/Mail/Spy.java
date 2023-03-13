package Mail;

import java.util.Objects;
import java.util.logging.Logger;

import static Mail.Main.AUSTIN_POWERS;

public class Spy implements MailService {

    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = Logger.getLogger(MailMessage.class.getName());
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            String to = mail.getTo();
            String from = mail.getFrom();
            String message = ((MailMessage) mail).getMessage();
            if (AUSTIN_POWERS.equals(to) | AUSTIN_POWERS.equals(from)) {
                logger.warning("Detected target mail correspondence: from " + from + " to " + to + " " + "\"" + message + "\"");
            } else logger.info("Usual correspondence: from " + from + " to " + to);
        }
        return mail;
    }
}
