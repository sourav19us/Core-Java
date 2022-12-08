
public class ExceptionsHandling {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Error is :-");
            System.out.println(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("'b' must be b!=0 ");
        }
    }
}
