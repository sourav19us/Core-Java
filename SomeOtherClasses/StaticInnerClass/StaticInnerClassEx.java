public class StaticInnerClassEx {
    int a = 25;
    static int b = 1425;

    public static class B {
        int y = 555;

        public void show() {
            // only static members can be access of outer class
            System.out.println("b = " + b + " y = " + y);
        }
    }
}
