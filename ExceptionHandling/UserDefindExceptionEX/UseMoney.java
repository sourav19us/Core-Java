
import pkg.Money;

import pkg.exp.UserDefindException;

public class UseMoney {

    public static void main(String[] args) {
        Money m1 = null;
        try {
            m1 = new Money(15);
        } catch (UserDefindException e1) {
            System.out.println(e1.getMessage());
        }
        m1.show();

        Money m2 = new Money();
        try {
            m2.set(-25);
        } catch (UserDefindException e1) {
            System.out.println(e1.getMessage());
        }
        m2.show();
    }
}
