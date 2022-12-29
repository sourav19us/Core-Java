import java.io.*;

public class ConvertlowerToUppercase {
    public static void main(String[] args) throws IOException {

        File f = new File("D.txt");
        String name = f.getName();
        File f1 = new File(name);
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
        bos.flush();
        bos.close();
        bis.close();
        f.delete();
        if (f2.renameTo(f1)) {
            System.out.println(" file rename");
        } else {
            System.out.println(" file not  rename");
        }
    }
}

// Note :- Try to rename “program1.txt” to “prog.txt”, “prog.txt” is a existing
// file in the f: drive .
