import java.io.*;

public class SplitlargeFilesEx3 {
    public static void main(String[] args) throws IOException {
        Console con = System.console();
        System.out.println("Enter File Name");
        String str = con.readLine();
        File f = new File(str.trim());

        if (f.exists()) {

            FileInputStream fis = new FileInputStream(str);
            BufferedInputStream bis = new BufferedInputStream(fis, 1024);
            System.out.println(f.length());
            long sf = f.length();
            System.out.print("Enter Size of File:- ");
            long su;
            su = Long.parseLong(con.readLine());
            System.out.println("Enter Size is :-" + su);
            int nof = 0;
            nof = (int) (sf / su);
            if ((sf % su) != 0) {
                nof++;
            }
            System.out.println("No of File is :- " + nof);
            for (int i = 0; i < nof; i++) {
                String fname;

                fname = "AQW" + i + ".txt";

                System.out.println(fname);
                String fpath = fname.trim();
                FileOutputStream fos = new FileOutputStream(fpath);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                int ch3;
                int no1 = 0;
                while ((ch3 = bis.read()) != -1) {
                    bos.write(ch3);
                    if (no1 == su) {
                        break;
                    }
                    no1++;
                }
                bos.flush();
                bos.close();
                fos.close();
            }
        } else {
            System.out.println("File not Exists");
        }
    }
}
