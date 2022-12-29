import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("Raf.bin", "rw");

        raf.writeChar((int) 'S');

        raf.writeInt(256);

        raf.writeDouble(1425.362);

        raf.writeBoolean(true);

        raf.seek(0);
        System.out.println(raf.readChar());
        System.out.println(raf.readInt());
        System.out.println(raf.readDouble());
        System.out.println(raf.readBoolean());

        raf.seek(2);
        System.out.println(raf.readInt());
        System.out.println(raf.readDouble());
        System.out.println(raf.readBoolean());

        raf.seek(6);
        System.out.println(raf.readDouble());
        System.out.println(raf.readBoolean());

        raf.seek(14);
        System.out.println(raf.readBoolean());
    }
}
