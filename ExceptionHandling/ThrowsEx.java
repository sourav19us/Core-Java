
class One {
    void show() throws ArithmeticException {
        int a = 14, b = 0;
        System.out.println(a / b);
    }

    void display() {

        System.out.println("class One display() methode");

    }

    // void m1() {
    // System.out.println("m1() start");
    // m2();
    // System.out.println("m1() end");
    // }

    // void m2() {
    // System.out.println("m2() start");
    // m3();
    // System.out.println("m2() end");
    // }

    // void m3() {
    // System.out.println("m3() start");
    // int a = 12, b = 0;
    // System.out.println(a / b);
    // System.out.println("m3() end");
    // }

    void m1() throws ArithmeticException {
        System.out.println("m1() start");
        m2();
        System.out.println("m1() end");
    }

    void m2() throws ArithmeticException {
        System.out.println("m2() start");
        m3();
        System.out.println("m2() end");
    }

    void m3() throws ArithmeticException {
        System.out.println("m3() start");
        int a = 12, b = 0;
        System.out.println(a / b);
        System.out.println("m3() end");
    }
}

public class ThrowsEx {

    public static void main(String[] args) {

        One ref1 = new One();
        System.out.println("\n \n");
        System.out.println("ref1 start");
        try {
            ref1.m1();
        } catch (Exception e) {

            System.out.println(e.getStackTrace());
        }
        System.out.println("ref1 end \n \n");

        One ref = new One();
        ref.m1();
        ref.show();
    }
}
