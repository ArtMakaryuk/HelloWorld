package KataAcademy.oopAndPackages.AbstractClasses;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        byte[] bytes = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q'};
        AsciiCharSequence asq = new AsciiCharSequence(bytes);
        System.out.println(asq.length());
        System.out.println(asq.toString());
        System.out.println(asq.charAt(2));
        System.out.println(asq.subSequence(2, 4));
    }

    public static class AsciiCharSequence implements CharSequence {

        private byte[] bytes;

        public AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public int length() {
            return this.bytes.length;
        }

        @Override
        public char charAt(int index) {
            return (char) this.bytes[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(this.bytes, start, end));
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.bytes.length; i++) {
                sb.append((char) this.bytes[i]);
            }
            return sb.toString();
        }
    }

}
