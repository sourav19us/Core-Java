public class Constructors {
    private int a;
    private int b;
    final private int c = 100;
    final private int d; // d can only and musk be declare in all constructor
    public static int e = 0;
    private static int f = 0; // excess by static methods and constructor

    // Types of Constructors in Java
    // 1. No-argument constructor
    // 2. Parameterized Constructor
    // 3. Default Constructor
    public Constructors() {
        a = 0;
        b = 0;
        d = 100;
        // c can not be changed
    }

    public Constructors(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
        // c can not be changed
    }

    public Constructors(Constructors obj) {
        a = obj.a;
        b = obj.b;
        d = obj.d;
    }

    public Constructors(int a) {
        // this() method called Constructors
        this(a, 25, 36);
    }

}
