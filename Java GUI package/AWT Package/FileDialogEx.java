import java.awt.*;
import java.io.*;
import java.nio.file.Files;

public class FileDialogEx {
    public static void main(String[] args) throws IOException {
        Frame f = new Frame("FileDialogEx");
        f.setSize(400, 300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        // FileDialog fd = new FileDialog(f, "LOAD File ", FileDialog.LOAD);
        // fd.setVisible(true);
        String path = "C:\\Users\\soura\\OneDrive\\Desktop\\java\\Arrays.txt";
        // path = fd.getDirectory();
        File fi = new File(path);
        FileInputStream fis = new FileInputStream(fi);
        int ch;
        StringBuffer strb = new StringBuffer();
        if (fi.exists()) {
            while ((ch = fis.read()) != -1) {
                String st = "" + (char) ch;
                strb.append(st);
            }
        } else {
            System.out.println("file not found");
        }
        System.out.println(strb);
        TextArea ta = new TextArea("This is a text ", 20, 25, TextArea.SCROLLBARS_BOTH);

        f.add(ta);

    }
}
