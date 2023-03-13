package Tests;

import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] content;

    public AsciiCharSequence(byte[] content) {
        this.setContent(content);
    }

    @Override
    public int length() {
        return getContent().length;
    }

    @Override
    public char charAt(int index) {
        return (char) getContent()[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(getContent(), start, end));
    }

    @Override
    public String toString() {
        return new String(content);
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}

