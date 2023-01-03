public class MoneyEx implements Cloneable {
    private int rs;
    private int paisa;

    public MoneyEx() {
    }

    public MoneyEx(int a, int b) {
        rs = a;
        paisa = b;
    }

    public String toString() {
        return rs + "." + paisa;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        MoneyEx mref = (MoneyEx) o;
        if (rs == mref.rs && paisa == mref.paisa) {
            return true;
        } else {
            return false;
        }
    }

    public Object clone() {
        MoneyEx temp = new MoneyEx();
        temp.rs = rs;
        temp.paisa = paisa;
        return temp;
    }

}