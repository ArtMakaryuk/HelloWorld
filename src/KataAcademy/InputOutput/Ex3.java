package KataAcademy.InputOutput;

import java.io.*;
import java.nio.charset.Charset;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[] {48, 49, 50, 51});
        Charset charset = Charset.forName("ASCII");
        System.out.println(readAsString(inputStream, charset));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = reader.read()) != -1) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}
