import java.io.*;

public class ConvertlowerToUppercase {
    public static void main(String[] args) throws IOException {

        File f = new File("D.txt");
        FileInputStream fis = new FileInputStream("D.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("temp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        File f2 = new File("temp.txt");
        int ch;
        while ((ch = bis.read()) != -1) {
            if (ch >= 97 && ch <= 122) {
                ch = ch - 32;
                bos.write(ch);
            } else {

                bos.write(ch);
            }
        }
        if (f2.renameTo(f)) {
            System.out.println(" file rename");
            f.delete();
        } else {
            System.out.println(" file not  rename");
        }
        bos.flush();
        bis.close();
    }
}
