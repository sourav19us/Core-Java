import java.io.*;

public class NumUseEx {
    public static void main(String[] args) throws IOException {
        File f = new File(args[0]);
        String arr[] = f.list();
        System.out.println("no of file is " + arr.length);
        int fno = arr.length;
        long lno = 0;
        for (int i = 0; i < arr.length; i++) {
            File fr = new File(f.getPath() + arr[i]);
            ReadNumEx r = new ReadNumEx(fr);
            Thread t1 = new Thread(r);
            t1.start();
            lno = r.getNo() + lno;
        }
        File fout = new File(f.getPath() + "total.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        char ch[] = new char[200];
        ch = (lno + "").toCharArray();
        int j = 0;
        while (ch != null) {
            fos.write(ch[0]);
            j++;
        }
    }
}
