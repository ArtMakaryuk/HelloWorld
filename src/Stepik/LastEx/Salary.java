package Stepik.LastEx;

public class Salary implements Sendable<Integer> {
    private String from;
    private String to;
    private Integer content;

    public Salary(String from, String to, Integer content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }


}
