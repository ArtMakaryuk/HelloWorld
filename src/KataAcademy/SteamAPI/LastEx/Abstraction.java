package KataAcademy.SteamAPI.LastEx;

public class Abstraction<T> implements Sendable<T> {

    protected final String from;
    protected final String to;
    protected T content;

    public Abstraction(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public T getContent() {
        return content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }
}
