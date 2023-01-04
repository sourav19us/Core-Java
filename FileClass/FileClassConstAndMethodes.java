import java.io.File;
import java.io.IOException;

public class FileClassConstAndMethodes {
    public static void main(String[] args) {

        // File class Constructors

        // 1.

        File f1 = new File("E:/Java/Arrays.java");
        // File f1 = new File("E:\\Java"); ok

        // 2.
        String path = "E:/Java";
        File f2 = new File(path, "Arrays.java");

        // 3.
        File f3 = new File("E:/java");
        File f4 = new File(f3, "E:/java");

        // Methodes of File Class

        // 1. boolean exists()

        if (f1.exists()) {
            System.out.println("File is exists ");
        } else {
            System.out.println("File is not exists ");
        }

        // 2. boolean isFile()

        if (f1.isFile()) {
            System.out.println(f1.getName() + " is a File");
        } else {
            System.out.println(f1.getName() + " is not a File");
        }

        // 3. boolean isDirectory()
        if (f1.isDirectory()) {
            System.out.println("is a Directory");
        } else {
            System.out.println("is not a Directory");
        }

        // 4. boolean canRead()
        if (f1.canRead()) {
            System.out.println(f1.getName() + " file  can be  readable");
        } else {
            System.out.println(f1.getName() + " file  can be  readable");
        }

        // 5. boolean canWrite()
        if (f1.canWrite()) {
            System.out.println(f1.getName() + " file  can be  writable");
        } else {
            System.out.println(f1.getName() + " file  can be  writable");
        }

        // 6.boolean canExecute()
        if (f1.canExecute()) {
            System.out.println(f1.getName() + " file  can be  executable");
        } else {
            System.out.println(f1.getName() + " file  can be  executable");
        }

        // 7. long length()

        System.out.println(f1.getName() + " file ,  Size of file is " + f1.length() + " (bytes) ");

        // 8. String getName()

        File f5 = new File("E:\\Java\\Abstraction\\Dogs.java");

        System.out.println("full path is \" E:\\Java\\Abstraction\\Dogs.java \" ");

        System.out.println("f5.getName() return " + f5.getName());

        // 9. String getParent()
        System.out.println("f5.getParent() return " + f5.getParent());

        // 10. String getPath()
        System.out.println("f5.getPath() return " + f5.getPath());

        // 11. String[] list()

        String str[];

        str = f3.list();

        for (String arr : str) {
            System.out.println(arr);
        }

        // 12. File[] listFile

        File[] str1;

        str1 = f3.listFiles();

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].isFile()) {
                System.out.println(f3.getName() + " is a " + "<FILE>");
            } else {
                System.out.println(f3.getName() + " is a " + "<DIR>");
            }
        }

        // 13. boolean createNewFile()

        // File f6 = new File("E:\\Java\\Abstraction\\NewFileCreate");
        File f6 = new File("E:/Java/FileClass/A.txt");
        // File f6 = new File("A.txt"); are same

        try {
            if (f6.createNewFile()) {
                System.out.println(f6.getName() + " <FILE> is Created ");
            } else {
                System.out.println(f6.getName() + " <FILE> is not Created");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 14. boolean mkdir()

        File f7 = new File("E:/Java/FileClass/TextFileDemo");

        if (f7.mkdir()) {
            System.out.println(f7.getName() + " <DIR> is Created");
        } else {
            System.out.println(f7.getName() + " <DIR> is not Created");
        }

        // 15. boolean mkdirs()
        File f8 = new File("E:/Java/FileClass/TextFileDemo/proj/scr/main");
        if (f8.mkdirs()) {
            System.out.println(f8.getPath() + " <DIR> is Created");
        } else {
            System.out.println(f8.getPath() + " <DIR> is not Created");
        }

        // 16. boolean delete

        File f9 = new File("E:/Java/FileClass/B.txt");
        File f10 = new File("E:/Java/FileClass/C.txt");
        File f11 = new File("E:/Java/FileClass/TextFileDemo/proj/scr/main/D.txt");
        boolean r1, r2, r3;
        try {
            r1 = f9.createNewFile();
            r2 = f10.createNewFile();
            r3 = f11.createNewFile();
            System.out.println(f9.getName() + "  " + f10.getName() + "  " + f11.getName() + " <FILE> is Created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String str3 = f10.getName();
        if (f10.delete()) {
            System.out.println(str3 + " <FILE> is delete");
        } else {
            System.out.println(str3 + " <FILE> is not delete");
        }

        // 17. boolean renameTo(File)
        // Try to rename “program1.txt” to “prog.txt”, “prog.txt” is a existing file in the f: drive .
    }
}