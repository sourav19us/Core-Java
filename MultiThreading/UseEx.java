import java.io.File;
import java.io.IOException;

public class UseEx {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\Java\\MultiThreading\\Files\\");
        String arr[] = f.list();
        System.out.println("no of file is " + arr.length);
        for (String string : arr) {
            System.out.println(string);
            File f1 = new File(f.getPath() + string);
            TextFilesEx tfx = new TextFilesEx();

            Read r = new Read(tfx, f1);
            r.start();
            try {
                r.join();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Write w = new Write(tfx, f1);
            w.start();
        }
    }
}