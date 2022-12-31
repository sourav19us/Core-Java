import java.io.*;

public class SplitlargeFilesEx {

    public static void main(String[] args) throws IOException {
        Console con = System.console();
        StringBuffer str = new StringBuffer("A.txt");
        File f = new File("All.txt");
        FileInputStream fis = new FileInputStream("All.txt");
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
            str.insert(1, String.valueOf(i));
            System.out.println("Name of File:- " + str);
            String st = "E:\\Java\\FileClass\\Stream\\SplitFiles\\" + str.toString();
            System.out.println(st);
            FileOutputStream fos = new FileOutputStream(st);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int ch;
            int no = 0;
            while ((ch = bis.read()) != -1) {
                bos.write(ch);
                if (no == su) {
                    break;
                }
                no++;
            }
            bos.flush();
            bos.close();
            fos.close();
            str.deleteCharAt(1);
        }
    }
}
