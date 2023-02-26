package InnerClassEx;

public class MainClass {
    public static void main(String[] args) {
        InnerClassEx ref = new InnerClassEx();

        // >>> 1
        InnerClassEx.A ref1 = new InnerClassEx().new A();
        ref1.show();

        // >>> 2
        InnerClassEx.A ref2 = ref.new A();
        ref2.show();

        // >>> 3
        new InnerClassEx().new A().show();
    }
}
