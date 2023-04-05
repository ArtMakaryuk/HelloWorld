package KataAcademy.SteamAPI.LastEx;

public interface Sendable<T> {
    T getContent();

    String getFrom();

    String getTo();
}
