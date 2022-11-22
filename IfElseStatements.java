public class IfElseStatements {
    public static void main(String[] args) {
        // if(condition expression) , condition expression must be return boolean type
        // like true and false
        int a = 14, b = 145;
        // if(a=14) C.T Error bcz expression is not boolean type
        System.out.println("a = " + a + " , b = " + b);
        if (a >= b) {
            System.out.println("this is if output a = " + a);
        } else {
            System.out.println("this is a else output b = " + b);
        }

        // Nested if - else
        if (a > b) {
            if (a == b) {
                System.out.println("a = b");
            } else {
                System.out.println("a > b");
            }
        } else {
            System.out.println(" a < b");
        }
    }
}
