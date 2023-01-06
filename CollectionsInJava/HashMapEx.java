import java.io.*;
import java.util.*;

public class HashMapEx {
    public static void main(String[] args) throws IOException {
        Console con = System.console();
        System.out.print("Enter File Name :- ");
        String path = con.readLine();
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        HashMap hmap = new HashMap();
        if (f.exists()) {
            int ch;
            int i = 0;
            char arr[] = new char[256];
            String str;
            // HashSet set = new HashSet();
            while ((ch = fis.read()) != -1) {
                if (!((char) ch == ' ' || (char) ch == '\n' || ch == 13)) {
                    arr[i] = (char) ch;
                    i++;
                    // System.out.println(i);
                } else {
                    str = String.copyValueOf(arr, 0, i);
                    // System.out.print(str + " ");
                    // fis.read();
                    i = 0;
                    int no = 1;
                    Integer obj = no;
                    if (hmap.containsKey(str)) {
                        String q = "" + hmap.get(str);
                        obj = Integer.parseInt(q);
                        obj++;
                        hmap.put(str, obj);

                    } else {
                        hmap.put(str, obj);
                    }

                }
            }
            System.out.println();
            // System.out.println(hmap);
            Set set1 = hmap.keySet();
            for (Object obj : set1) {
                System.out.println(obj + " = " + hmap.get(obj));
            }
        }
    }
}
