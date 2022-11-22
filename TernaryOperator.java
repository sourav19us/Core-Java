public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator
        // We can use the ternary operator in place of if-else conditions
        int a, b, max;
        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        max = (a > b) ? a : b;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("max no is " + max);

    }
}
