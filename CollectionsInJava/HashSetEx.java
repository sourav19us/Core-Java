import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("c++");
        hset.add("java");
        hset.add("python");
        hset.add("c++");

        System.out.println(hset.size());
        System.out.println(hset.contains("c++"));

    }
}
