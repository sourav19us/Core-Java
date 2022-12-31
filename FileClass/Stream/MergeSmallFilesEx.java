import java.io.*;

public class MergeSmallFilesEx {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\FileClass\\Stream\\SplitFiles");
        String str[];
        str = f.list();
        for (String arr : str) {
            System.out.println(arr);
        }
        FileOutputStream fos = new FileOutputStream("E:\\Java\\FileClass\\Stream\\SplitFiles\\AllEx.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (int i = 0; i < str.length; i++) {
            String path = "E:\\Java\\FileClass\\Stream\\SplitFiles\\" + str[i];
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int ch;
            while ((ch = bis.read()) != -1) {
                bos.write(ch);
            }
            bis.close();
            fis.close();
        }
        bos.flush();
        bos.close();
        fos.close();
        File f2 = new File("E:\\Java\\FileClass\\Stream\\SplitFiles\\AllEx.txt");
        System.out.println("File name is " + f2.getName());
        System.out.println("File path is " + f2.getPath());

    }
}
