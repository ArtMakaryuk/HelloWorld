package Stepik.LastEx;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
