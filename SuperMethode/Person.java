package a.b.c;

public class Person {
    String name, surname;

    public Person() {
        name = "Unknown";
        surname = "Unknown";
    }

    public Person(String n1, String n2) {
        name = n1;
        surname = n2;
    }

    public Person(Person Pref) {
        name = Pref.name;
        surname = Pref.surname;
    }

    public void show() {
        System.out.println("Name = " + name);
        System.out.println("SurName = " + surname);
    }
}
