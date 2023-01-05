public class UseSTACK {
    public static void main(String[] args) {
        STACK sk = new STACK();
        sk.push("c++");
        sk.push("java");
        sk.push(1254);
        System.out.println(sk.empty());
        try {
            System.out.println(" 1 " + sk.pop());
            System.out.println(" 2 " + sk.pop());
            System.out.println(" 3 " + sk.pop());
            System.out.println(" 4 " + sk.pop());
        } catch (UnderFlowException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sk.empty());
    }
}
