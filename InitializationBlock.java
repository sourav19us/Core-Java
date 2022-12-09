public class InitializationBlock {
    // Initialization Block types
    // 1. Instance Initialization Block
    // 2. Static Initialization Block

    // Initialization blocks are executed whenever the class is initialized and
    // before constructors are invoked.
    // Multiple Initialization Blocks in a Program
    // Initialization Blocks run in the order they appear in the program

    // private int a;{ a = 100; } // ok
    // private int b;{ b = 256; } // ok

    private int a;
    private int b;
    static private int c;
    static private int d;
    // Instance Initialization Block
    // The Instance Initialization Block is invoked after the parent class
    // constructor is invoked (i.e. after super() constructor call)

    {
        a = 100;
        b = 256;
        System.out.println("Instance Initialization Block");
    }

    // Static Initialization Block
    static {
        c = 25;
        d = 59;
        System.out.println("Static Initialization Block");
    }

    public InitializationBlock() {
        System.out.println("constructors");
    }
}