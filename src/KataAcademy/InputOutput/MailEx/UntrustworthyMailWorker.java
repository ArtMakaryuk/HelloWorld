package KataAcademy.InputOutput.MailEx;

public class UntrustworthyMailWorker implements MailService{
    MailService[] workers;

    private final MailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] workers) {
        this.workers = workers;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable sb = mail;
        for (MailService worker : workers) {
            sb = worker.processMail(sb);
        }
        return realMailService.processMail(sb);
    }
}
