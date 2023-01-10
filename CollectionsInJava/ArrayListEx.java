import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("c++");
        alist.add("c");
        alist.add("java");
        alist.add("python");
        alist.add("html");

        // Iteration
        // 1. for loop
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }

        // 2. for each loop
        for (String str : alist) {
            System.out.println(str);
        }

        // 3. forEach() method
        alist.forEach(itam -> System.out.println("" + itam));

        // 4. Iterator
        Iterator itr = alist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 5. ListIterator
        ListIterator litr = alist.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
