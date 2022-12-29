import java.io.*;

public class SequenceInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("D.txt");
        FileInputStream fis2 = new FileInputStream("Alph.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        BufferedInputStream bis = new BufferedInputStream(sis);
        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int ch;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        bos.flush();
        bos.close();
        bis.close();
    }
}
