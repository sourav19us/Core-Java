public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        // && , || , !
        // *return a "boolean" result , true or false
        int a = 14, b = 25;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b || a < b is " + ((a == b) || (a < b)));
        System.out.println("a == b && a < b is " + ((a == b) && (a < b)));
        System.out.println("!(a > b) is " + !(a > b));
        System.out.println("!(a < b) is " + !(a < b));
    }
}
