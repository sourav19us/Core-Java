import java.io.*;

public class NumUseEx {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        String arr[] = f.list();
        System.out.println("no of file is " + arr.length);
        int fno = arr.length;
        long lno = 0;
        ReadNumEx r[] = new ReadNumEx[fno];
        Thread t1[] = new Thread[fno];
        for (int i = 0; i < arr.length; i++) {
            File fr = new File(f.getPath() + "\\" + arr[i]);
            r[i] = new ReadNumEx(fr);
            t1[i] = new Thread(r[i]);
            t1[i].start();
            lno = r[i].getNo() + lno;
        }
        File fout = new File(f.getPath() + "\\total.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        char ch[] = new char[200];
        ch = ((lno + "").trim()).toCharArray();
        // int j = 0;
        for (int j = 0; j < ch.length; j++) {
            fos.write(ch[j]);
            // j++;
        }
        // j = 0;

    }
}
