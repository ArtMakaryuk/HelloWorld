package Stepik.InputOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        byte[] buf = {0x33, 0x45, 0x01};
        InputStream inputStream = new ByteArrayInputStream(buf);
        System.out.println(checkSumOfStream(inputStream));
    }
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int b;
        int crc = 0;
        try {
            while ((b = inputStream.read()) != -1) {
                crc = Integer.rotateLeft(crc, 1) ^ b;
            }
        } catch (IOException e) {
            throw new IOException();
        }

        return crc;
    }
}
