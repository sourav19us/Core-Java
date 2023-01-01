import java.io.*;

public class ObjectInputOutputStreamEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("ObjectPersistenceFileEx.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ObjectPersistenceEx ref = new ObjectPersistenceEx("Ram", 252361.362, "Ascf@1425");
        oos.writeObject(ref);
        ObjectPersistenceEx ref2 = new ObjectPersistenceEx("sourav", 36259161.362, "KOI125mk@de415");
        oos.writeObject(ref2);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("ObjectPersistenceFileEx.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ObjectPersistenceEx ref1;
        ref1 = (ObjectPersistenceEx) ois.readObject();
        ref1.show();
        ref1 = (ObjectPersistenceEx) ois.readObject();
        ref1.show();
        ois.close();
    }
}
