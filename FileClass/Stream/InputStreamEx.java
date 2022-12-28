import java.io.*;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A.text");
        int chr;
        while ((chr = fis.read()) != -1) {
            System.out.print(chr + " ");
            System.out.print((char) chr);
        }

        fis.close();
    }
}