package Stepik.InputOutput;

import java.io.IOException;

public class InputStreamEx2 {
    public static void main(String[] args) throws IOException {
        int next = 0;
        int prev = System.in.read();
        while (prev != -1) {
            next = System.in.read();
            if (prev != 13 || next != 10) {
                System.out.write(prev);
            }
            prev = next;
        }
        System.out.flush();}
}
