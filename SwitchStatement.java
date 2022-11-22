public class SwitchStatement {
    public static void main(String[] args) {
        // switch statement
        // switch (expression) , expression = byte , short , char , int , String only
        // default: default statement is optional
        byte a = 1;
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("this is default statement");
                break;
        }
    }
}
