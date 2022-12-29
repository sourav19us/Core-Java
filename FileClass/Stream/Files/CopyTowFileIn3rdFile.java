import java.io.*;

public class CopyTowFileIn3rdFile {
    public static void main(String[] args) throws IOException {
        if (args.length > 3) {
            System.out.println("Too many files");
            System.exit(0);
        }
        if (args.length < 3) {
            System.out.println("less than 3 files");
            System.exit(0);
        }

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        if (!(f1.exists())) {
            System.out.println(args[0] + " file is not exists");
            System.exit(0);
        }
        if (!(f2.exists())) {
            System.out.println(args[1] + " file is not exists");
            System.exit(0);
        }

        // FileInputStream fio2 = new FileInputStream(f2);
        // BufferedInputStream bio2 = new BufferedInputStream(fio2);
        FileOutputStream fos = new FileOutputStream(args[2], true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (int i = 0; i < ((args.length) - 1); i++) {
            FileInputStream fio1 = new FileInputStream(args[i]);
            BufferedInputStream bio1 = new BufferedInputStream(fio1);
            int ch;
            while ((ch = bio1.read()) != -1) {
                bos.write(ch);
            }
            bio1.close();
            bos.flush();
        }

    }
}
