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
        }
        for (int i = 0; i < arr.length; i++) {
            t1[i].start();
        }
        for (int i = 0; i < arr.length; i++) {
            lno = r[i].getNo() + lno;
        }
        File fout = new File(f.getPath() + "\\total.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeLong(lno);
        dos.close();

    }
}
