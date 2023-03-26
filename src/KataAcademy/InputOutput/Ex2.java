package KataAcademy.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex2 {
    public static void main(String[] args) {
        byte[] original = {1, 2, 3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(original);
    }
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        while ((b = inputStream.read()) != -1) {
            if (b % 2 == 0) {
                outputStream.write(b);
            }
        }
        outputStream.flush();
    }
}
