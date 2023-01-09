import java.io.*;
import java.util.*;

public class StreamTokenizerEx {
    public static void main(String[] args) throws IOException {

        Console con = System.console();
        System.out.print("Enter File Name :- ");
        String path = con.readLine();
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        StreamTokenizer st = new StreamTokenizer(fis);
        HashMap hmap = new HashMap();
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            String str;
            switch (st.ttype) {
                case StreamTokenizer.TT_EOL: {
                    str = "EOL";
                    break;
                }
                case StreamTokenizer.TT_NUMBER: {
                    str = "" + st.nval;
                    break;
                }
                case StreamTokenizer.TT_WORD: {
                    str = st.sval;
                    break;
                }
                default: {
                    str = "" + ((char) st.ttype);
                }
            }
            System.out.println(str);

        }
    }
}
