import java.io.*;

public class MergeSmallFilesEx2 {
    public static void main(String[] args) throws IOException {
        // File f = new File("E:\\Java\\FileClass\\Stream\\SplitFiles");

        FileOutputStream fos = new FileOutputStream("E:\\Java\\FileClass\\Stream\\SplitFiles\\AllEx.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (int i = 0; i < 26; i++) {

            String fname;
            // char ch[] = new char[200];
            // ch[0] = (char) (i + 65);
            // ch[1] = 'Q';
            // ch[2] = '.';
            // ch[3] = 't';
            // ch[4] = 'x';
            // ch[5] = 't';
            // fname = String.copyValueOf(ch);
            fname = (char) (i + 66) + "Q.txt";
            System.out.println(fname);
            String path = "E:\\Java\\FileClass\\Stream\\SplitFiles\\" + fname.trim();
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
                File f1 = new File(path);
                f1.delete();

            } else {
                System.out.println("File not Exists");
                break;
            }
        }
        bos.flush();
        bos.close();
        fos.close();
        File f2 = new File("E:\\Java\\FileClass\\Stream\\SplitFiles\\AllEx.txt");
        System.out.println("File name is " + f2.getName());
        System.out.println("File path is " + f2.getPath());

    }

}
