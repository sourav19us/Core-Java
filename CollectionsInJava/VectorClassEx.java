import java.util.*;

public class VectorClassEx {
    public static void main(String[] args) {
        Vector vec = new Vector();
        for (int i = 0; i < 10; i++) {

            vec.add("java" + (i + 1));

        }
        // >>> use for loop
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i));
        }

        // >>> use Iterator
        Iterator itr = vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // >> use ListIterator
        ListIterator litr = vec.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // >>> use for-each loop
        for (Object o : vec) {
            System.out.println(o);
        }
    }
}
