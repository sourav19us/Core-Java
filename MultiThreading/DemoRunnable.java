public class DemoRunnable {
    public static void main(String[] args) {
        OneRunnableEx o = new OneRunnableEx();
        Thread t1 = new Thread(o);
        t1.start();

        TwoRunnableEx t = new TwoRunnableEx();
        Thread t2 = new Thread(t);
        t2.start();

        ThreeRunnableEx th = new ThreeRunnableEx();
        Thread t3 = new Thread(th);
        t3.start();
    }
}
