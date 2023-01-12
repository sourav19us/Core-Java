public class Demo {
    public static void main(String[] args) {
        One o = new One();
        o.start();

        try {

            Two t = new Two();
            t.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Three th = new Three();
        th.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("this is a main thread");
        }
    }
}
