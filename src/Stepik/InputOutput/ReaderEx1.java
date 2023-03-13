package Stepik.InputOutput;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReaderEx1 {
    public static void main(String[] args) throws IOException {
        byte[] buf = {48, 49, 50, 51};
        ByteArrayInputStream arr = new ByteArrayInputStream(buf);
        Charset charset = StandardCharsets.US_ASCII;
        System.out.println(readAsString(arr, charset));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String retval;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) {
            r.write(b);
        }
        retval = r.toString();
        return retval;
    }
}
