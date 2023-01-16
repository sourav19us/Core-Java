import java.io.*;
import java.util.Vector;

public class TextFilesEx {
    private boolean ft = true;
    // public String str = null;
    private Vector<Integer> vec = new Vector<Integer>();

    synchronized public void readfile(File f) throws IOException {
        while (!ft) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("r");

        }

        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int ch;
        while ((ch = bis.read()) != -1) {

            vec.add(bis.read());

        }
        ft = false;
        bis.close();
        notify();
    }

    synchronized public void writeFile(File f) throws IOException {
        while (ft) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("W");

        }
        String str1 = f.getName();
        FileOutputStream fos = new FileOutputStream(str1);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (Integer integer : vec) {
            bos.write(integer);
        }
        notify();
        bos.flush();
        bos.close();
        ft = true;
        vec.clear();

    }
}