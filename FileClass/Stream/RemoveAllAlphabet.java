import java.io.*;

public class RemoveAllAlphabet {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Alph.txt");
        String name = f1.getName();
        File f2 = new File(name);

        FileInputStream fis = new FileInputStream("Alph.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("temp.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        File f3 = new File("temp.txt");

        int ch;
        while ((ch = bis.read()) != -1) {
            if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {

            } else {

                bos.write(ch);
            }
        }
        bos.flush();
        bos.close();
        bis.close();
        f1.delete();
        if (f3.renameTo(f2)) {
            System.out.println("file rename");
        } else {
            System.out.println("file not  rename");
        }
        System.out.println(name);

    }
}
