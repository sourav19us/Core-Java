package a;

import a.b.ContactInfo;

public class Employee extends ContactInfo {
    double salary;

    public Employee() {
        salary = 0;
    }

    public Employee(String str1, String str2, long d1, double d2) {
        super(str1, str2, d1);
        salary = d2;
    }

    public Employee(Employee EmpRef) {
        super(EmpRef);
        salary = EmpRef.salary;
    }

    public void show() {
        super.show();
        System.out.println("Salary = " + salary);
    }
}
