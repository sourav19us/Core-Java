import java.io.*;

public class MergeSmallFilesEx3 {
    public static void main(String[] args) throws IOException {
        // File f = new File("E:\\Java\\FileClass\\Stream\\SplitFiles");

        FileOutputStream fos = new FileOutputStream("AllEx.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (int i = 0; i > 0; i++) {

            String fname;

            fname = "AQW" + i + ".txt";
            System.out.println(fname);
            String path = fname.trim();
            File f2 = new File(path);
            if (f2.exists()) {
                FileInputStream fis = new FileInputStream(path);
                BufferedInputStream bis = new BufferedInputStream(fis);
                int ch1;
                while ((ch1 = bis.read()) != -1) {
                    bos.write(ch1);
                }
                bis.close();
                fis.close();
                // File f1 = new File(path);
                // f1.delete();

            } else {
                System.out.println("File not Exists");
                break;
            }
        }
        bos.flush();
        bos.close();
        fos.close();
        // File f2 = new File("E:\\Java\\FileClass\\Stream\\SplitFiles\\AllEx.txt");
        // System.out.println("File name is " + f2.getName());
        // System.out.println("File path is " + f2.getPath());

    }
}
