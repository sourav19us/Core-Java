public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        // && , || , !
        // *return a "boolean" result , true or false
        // in && operator if 1st expression is false then it not check 2nd expression
        // in || operator if 1st expression is True then it not check 2nd expression

        int a = 14, b = 25;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b || a < b is " + ((a == b) || (a < b)));
        System.out.println("a == b && a < b is " + ((a == b) && (a < b)));
        System.out.println("!(a > b) is " + !(a > b));
        System.out.println("!(a < b) is " + !(a < b));

        // >>>>>>>>>>>> & , | Bitwish operator as logical operator
        // & same as && , but difference is "&" check 1st and 2nd expression both
        // | same as || , but difference is "&" check 1st and 2nd expression both

        if (a == b & ++b <= a) {
            System.out.println("this is & opertor");
        }
        if (a == b && ++b <= a) { // in this case 1st expr is false so 2nd expr is not check , ++b is not execute
            System.out.println("this is & opertor");
        }
        System.out.println(" b =  " + b + " after &");

        //
    }
}
