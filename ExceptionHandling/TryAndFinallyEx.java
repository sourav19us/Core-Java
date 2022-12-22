public class TryAndFinallyEx {
    public static void main(String[] args) {
        int a = 145, b = 0;
        try {
            System.out.println("try start");
            System.out.println(a / b);
            System.out.println("try end");

        } finally {// executed all time
            System.out.println("welcome to  finally");
        }
    }
}
