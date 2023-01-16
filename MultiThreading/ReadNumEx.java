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
        int i = 0;
        try {

            FileInputStream fis = new FileInputStream(f);
            while ((chr = fis.read()) != -1) {
                if ((char) chr != '\n') {
                    ch[i] = (char) chr;
                    i++;
                } else {
                    str = String.copyValueOf(ch, 0, i);
                    no = no + Long.parseLong(str.trim());
                    i = 0;
                }
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
