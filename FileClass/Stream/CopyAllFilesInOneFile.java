import java.io.*;

public class CopyAllFilesInOneFile {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\FileClass\\Stream\\Files");
        String arr[];
        arr = f.list();
        for (String str : arr) {
            System.out.println(str);
        }
        FileOutputStream fos = new FileOutputStream("All.txt", true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (int i = 0; i < (arr.length); i++) {
            FileInputStream fio1 = new FileInputStream(arr[i]);
            BufferedInputStream bio1 = new BufferedInputStream(fio1);
            int ch;
            while ((ch = bio1.read()) != -1) {
                bos.write(ch);
            }
            bio1.close();
            bos.flush();
        }
    }
}
