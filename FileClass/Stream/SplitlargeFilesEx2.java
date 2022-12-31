import java.io.Console;
import java.io.*;

public class SplitlargeFilesEx2 {
    public static void main(String[] args) throws IOException {
        Console con = System.console();
        System.out.println("Enter File Name");
        String str = con.readLine();
        File f = new File(str);
        char ch1[];
        ch1 = str.toCharArray();
        int no = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == '.') {
                no = i;
                // System.out.println("i = " + i);
            }
        }

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
                char ch[] = new char[200];
                ch[0] = (char) (i + 65);
                ch[1] = 'Q';
                ch[2] = '.';
                int q = 3;
                for (int j = (no + 1); j < ch1.length; j++) {
                    ch[q] = ch1[j];
                    q++;
                }
                fname = String.copyValueOf(ch);
                System.out.println(fname);
                String fpath = "E:\\Java\\FileClass\\Stream\\SplitFiles\\" + (fname.trim());
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
