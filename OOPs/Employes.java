// package OOPs;

public class Employes {
    private String name = ""; // instant variable
    private int age;
    private int salary;

    public void set(String Ename, int Eage, int Esalary) {
        name = Ename;
        age = Eage;
        salary = Esalary;
    }

    public Employes(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employes() {
        name = null;
        age = 0;
        salary = 0;
    }

    public void get() {
        System.out.println("Employes name is " + name);
        System.out.println("Employes age  is " + age);
        System.out.println("Employes salary is " + salary);
    }
}
