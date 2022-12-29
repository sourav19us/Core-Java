import java.io.*;

public class OutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A.text");
        FileOutputStream fos = new FileOutputStream("B.text", true);
        int chr;

        while ((chr = fis.read()) != -1) {
            System.out.print(chr + " ");
            System.out.print((char) chr);
            fos.write(chr);
        }

        fis.close();
        fos.close();
    }
}
