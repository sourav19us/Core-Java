import java.io.*;

public class DataInputOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Data.bin");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeChar((int) 'A');
        dos.writeInt(14256);
        dos.writeDouble(1425.3625);
        dos.writeBoolean(true);

        FileInputStream fis = new FileInputStream("Data.bin");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
    }
}
