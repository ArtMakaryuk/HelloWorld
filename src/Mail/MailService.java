package Mail;

/*
���������, ������� ������ �����, ������� ����� �����-���� ������� ���������� �������� ������.
*/
public interface MailService {
    Sendable processMail(Sendable mail);
}