import java.util.*;

class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int hashCode() {
        String str = name + surname;
        return str.hashCode();
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        Person pref = (Person) o;
        if (name == pref.name && surname == pref.surname) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("name is :- " + name + "  surname is :- " + surname);
    }
}

public class HashMapEx3 {
    public static void main(String[] args) {

        HashMap map = new HashMap();

        Person p1 = new Person("sourav", "saini");
        map.put(p1, "777777");
        Person p2 = new Person("sourav", "saini");
        map.put(p2, "333333");
        System.out.println(map.size()); // 2 without override hashCode() method
        System.out.println(map.size()); // 2 After override hashCode() method bcz b/w p1 and p2 have
        // shallow comparison so for Deep Comparison override equals() method
        System.out.println(map.size()); // 1 in this case p2 object is ovveride p1 object
        System.out.println(map.get(p1) + " " +
                map.get(p2));

    }
}
