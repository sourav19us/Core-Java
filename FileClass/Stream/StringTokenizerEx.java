import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {

        String str = "Hello World ?";

        StringTokenizer stk = new StringTokenizer(str);

        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }
    }
}
