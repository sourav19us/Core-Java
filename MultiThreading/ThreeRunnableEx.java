public class ThreeRunnableEx implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("this is 2nd Runnable");
        }
    }
}
