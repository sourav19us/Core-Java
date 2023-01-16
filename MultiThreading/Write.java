import java.io.File;
import java.io.IOException;

public class Write extends Thread {
    private TextFilesEx wf;
    private File filew;

    public Write(TextFilesEx wf1, File f) {
        wf = wf1;
        filew = f;
    }

    public void run() {

        try {

            wf.writeFile(filew);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // try {
        // sleep(3000);
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
    }
}
