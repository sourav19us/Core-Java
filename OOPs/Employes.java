package OOPs;

public class Employes {
    private String name = ""; // instant variable
    private int age;
    private int salary;

    public void set(String Ename, int Eage, int Esalary) {
        name = Ename;
        age = Eage;
        salary = Esalary;
    }

    public void get() {
        System.out.println("Employes name is " + name);
        System.out.println("Employes age  is " + age);
        System.out.println("Employes salary is " + salary);
    }
}
