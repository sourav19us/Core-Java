import a.Employee;

public class Office {
    public static void main(String[] args) {
        System.out.println(" >>>>>>>>> 1st object <<<<<<<<<");
        Employee m1 = new Employee();
        m1.show();
        System.out.println(" >>>>>>>>> 2nd object <<<<<<<<<");
        Employee m2 = new Employee("Sourav", "Saini", 91_1234567l, 145265.362);
        m2.show();
        System.out.println(" >>>>>>>>> 3rd object <<<<<<<<<");
        Employee m3 = new Employee(m2);
        m3.show();

    }
}
