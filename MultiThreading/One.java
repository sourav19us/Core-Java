public class One extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is a 1st Thread");
        }
    }

}