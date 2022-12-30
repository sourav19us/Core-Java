import java.io.*;

public class CountOfAlphabeLinesEtcEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int ch;
        int lin = 0;
        int Alph = 0;
        int str = 0;
        while ((ch = bis.read()) != -1) {
            if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
                Alph++;
            }

            if ((char) ch == '\n') {
                lin++;
            }

        }
        bis.close();
        fis.close();
        System.out.println("No of Alphabet is  :- " + Alph);
        System.out.println("No of Lines is  :- " + (lin + 1));
        int ch1;
        FileOutputStream fos = new FileOutputStream("tempDemo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        FileInputStream fis1 = new FileInputStream("Demo.txt");
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        int i = 0;
        while ((ch1 = bis1.read()) != -1) {
            if (ch1 == '\n' || ch1 == '\t' || ch1 == 13) {
                bos.write((int) ' ');

            } else {
                bos.write(ch1);
            }
        }
        bos.flush();
        bos.close();

        FileInputStream fis2 = new FileInputStream("tempDemo.txt");
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        int ch2;
        while ((ch2 = bis2.read()) != -1) {
            while (ch2 == ' ') {
                ch2 = bis2.read();
                if (ch2 != ' ') {
                    str++;
                }
            }

        }
        bis2.close();
        File f = new File("tempDemo.txt");
        f.delete();
        System.out.println("No of String is  :- " + (str + 1));

        // System.out.println((int) '\n');
        // System.out.println((int) ' ');
        // System.out.println((int) '\t');
        // System.out.println("sourav\tsaini");
        // System.out.println("sourav saini");
        // System.out.println((char) 13);
    }
}
