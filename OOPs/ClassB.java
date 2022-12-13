public class ClassB extends ClassA {
    private int a1;
    int b1;

    public void set(int a, int b, int c, int d) {
        // set(a, b); this is a sub class methode
        super.set(a, b);
        a1 = c;
        b1 = d;
    }

    // @ Overriding
    public void show() {
        super.show();
        System.out.println("a = " + a1 + " b = " + b1);
    }
}
