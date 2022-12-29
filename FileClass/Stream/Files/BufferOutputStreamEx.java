import java.io.*;

public class BufferOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A.text");
        BufferedInputStream bin = new BufferedInputStream(fis, 1024);
        FileOutputStream fos = new FileOutputStream("C.text", true);
        BufferedOutputStream bos = new BufferedOutputStream(fos, 2048);
        int chr;
        while ((chr = bin.read()) != -1) {
            System.out.print(chr + " ");
            System.out.print((char) chr);
            bos.write(chr);
        }

        bin.close();
        bos.close();
    }
}
