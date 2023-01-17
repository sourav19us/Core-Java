import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;

import javax.xml.transform.Source;

public class ReadNumEx implements Runnable {

    private File f;
    private long no;

    public ReadNumEx(File f1) {
        f = f1;
    }

    synchronized public void run() {
        char ch[] = new char[200];
        int chr;
        String str;

        try {

            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            while (dis.readLine() != null) {
                str = dis.readLine();
                no = no + Long.parseLong(str.trim());

            }
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        notify();

    }

    public long getNo() {
        return no;
    }
}
