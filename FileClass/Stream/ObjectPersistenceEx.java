import java.io.Serializable;

public class ObjectPersistenceEx implements Serializable {
    private String name;
    private double salary;
    transient private String pwd;

    public ObjectPersistenceEx(String name1, double salary1, String pwd1) {
        name = name1;
        salary = salary1;
        pwd = pwd1;
    }

    public void show() {
        System.out.println("Name is " + name);
        System.out.println("Salary is " + salary);
        System.out.println("PassWord  is " + pwd);
    }
}
