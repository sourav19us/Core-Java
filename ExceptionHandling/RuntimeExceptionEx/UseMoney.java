import pkg.Money;
import pkg.runtimeexp.RunTimeExceptionEx;;

public class UseMoney {
    public static void main(String[] args) {

        Money m1 = new Money(25);
        m1.show();
        m1.set(-15);
        m1.show();
    }
}
