class Money {
    private int a1;

    public Money() {
    }

    public Money(int a1) {
        this.a1 = a1;
    }

    public String toString() {
        return "" + a1;
    }
}

public class WrapperClassEx {

    public static void main(String[] args) {
        int a = 25;
        Integer aref = new Integer(a);
        Integer aref1 = new Integer("142");
        // Integer aref = new Integer("142L");// C.T Error
        // Integer aref = new Integer("142.36");// C.T Error
        System.out.println(aref);
        int b = aref.intValue();
        Money r = new Money(2563);
        System.out.println(r);

        Boolean b2 = new Boolean("true");
        Boolean b1 = new Boolean(true);
    }
}