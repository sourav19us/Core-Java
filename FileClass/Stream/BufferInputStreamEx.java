import java.io.*;

public class BufferInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A.text");
        BufferedInputStream bin = new BufferedInputStream(fis, 1024);
        int ch;
        while ((ch = bin.read()) != -1) {
            System.out.print(ch + " ");
            System.out.print((char) ch);
        }

        bin.close();
    }
}
