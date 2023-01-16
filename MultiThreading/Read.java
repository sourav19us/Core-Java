import java.io.File;
import java.io.IOException;

public class Read extends Thread {
    private TextFilesEx rf;
    private File file;

    public Read(TextFilesEx rf1, File f) {
        rf = rf1;
        file = f;
    }

    public void run() {

        try {

            rf.readfile(file);
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
