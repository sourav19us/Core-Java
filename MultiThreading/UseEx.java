import java.io.File;
import java.io.IOException;

public class UseEx {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\MultiThreading\\Files\\");
        String arr[] = f.list();
        System.out.println("no of file is " + arr.length);
        File f1[] = new File[arr.length];
        TextFilesEx tfx[] = new TextFilesEx[arr.length];
        Read r[] = new Read[arr.length];
        Write w[] = new Write[arr.length];
        for (int i = 0; i < arr.length; i++) {
            f1[i] = new File(f.getPath() + "\\" + arr[i]);
            tfx[i] = new TextFilesEx();

            r[i] = new Read(tfx[i], f1[i]);
            r[i].start();
            try {
                r[i].join();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            w[i] = new Write(tfx[i], f1[i]);
            w[i].start();
        }
    }
}