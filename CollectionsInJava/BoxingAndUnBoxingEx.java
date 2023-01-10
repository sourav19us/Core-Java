public class BoxingAndUnBoxingEx {
    public static void main(String[] args) {
        int x = 25;
        Integer no = x;// Boxing (in new version of java) and in old version we use Wrapper class
        System.out.println(no);

        Integer no1 = 2365;

        int y = no1; // UnBoxing (in new version of java) and in old version we use Wrapper class
        System.out.println(y);
    }
}
