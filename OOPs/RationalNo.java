package OOPs;

public class RationalNo {
    private int a;
    private int b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void get() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + "/" + b);
    }
}
