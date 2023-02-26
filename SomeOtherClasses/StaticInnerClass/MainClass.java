
public class MainClass {
    public static void main(String[] args) {
        StaticInnerClassEx ref1 = new StaticInnerClassEx();

        // >>>>>>>
        StaticInnerClassEx.B ref2 = new StaticInnerClassEx.B();
        ref2.show();

    }
}
