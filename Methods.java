public class Methods {
    private int a;
    private int b;
    final private int c = 100;
    final private int d; // d can only and musk be declare in all constructor
    public static int e = 0;
    private static int f = 0; // excess by static methods and constructor

    public Methods(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
        // c can not changed
        e++;
        f++;
    }

    public Methods() {
        this.a = 0;
        this.b = 0;
        this.d = 100;
        // c can not changed
        e++;
        f++;
        get();
    }

    // Methods and Methods Overloading
    // Different Ways of Method Overloading in Java
    // . Changing the Number of Parameters.
    // . Changing Data Types of the Arguments.
    // . Changing the Order of the Parameters of Methods

    // Types of Methods
    // 1. instance methods
    // 2.Static methods

    public int sum(int a, int b) { // public void sum(int a, int b) is same show C.T Error
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public float sum(float a, float b, float c) {
        return a + b + c;
    }

    public void get() {
        System.out.println("a = " + a + "b = " + b);
        show(); // ok
    }

    public static void show() {
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        // get(); it show C.T Error
    }

    // >>> Methods for Arithmetic Operation b/w Objects
    public Methods add(Methods obj) {
        Methods temp = new Methods();
        temp.a = a + obj.a;
        temp.b = b + obj.b;
        return temp;
    }
}
