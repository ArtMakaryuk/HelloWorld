package KataAcademy.InputOutput;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        byte[] original = {1, -2, -3, 4, 5};
        InputStream inputStream = new ByteArrayInputStream(original);
        int ans = sumOfStream(inputStream);
        System.out.println(ans);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int b;
        while ((b = inputStream.read()) != -1) {
            sum += (byte) b;
        }
        return sum;
    }

}
