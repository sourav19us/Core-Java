package pkg;

import pkg.runtimeexp.RunTimeExceptionEx;

public class Money {
    private int r;

    public Money() {
    }

    public Money(int r1) throws RunTimeExceptionEx {

        if (r1 >= 0) {
            r = r1;
        } else {
            throw new RunTimeExceptionEx("Amount is not -ve value ");
        }
    }

    public void set(int r1) throws RunTimeExceptionEx {

        if (r1 >= 0) {
            r = r1;
        } else {
            throw new RunTimeExceptionEx("Amount is not -ve value ");
        }
    }

    public void show() {
        System.out.println("Amount is " + r);
    }

}
