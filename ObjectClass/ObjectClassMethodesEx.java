public class ObjectClassMethodesEx {
    public static void main(String[] args) {

        MoneyEx m1 = new MoneyEx(12, 50);
        MoneyEx m2 = new MoneyEx(254, 50);
        MoneyEx m3;
        MoneyEx m4 = new MoneyEx(12, 50);
        System.out.println(m1);
        System.out.println("Amount is " + m1);
        System.out.println(m1.toString());
        m3 = (MoneyEx) m2.clone();
        System.out.println("Amount is " + m3);
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));

        Class c = m4.getClass();
        System.out.println(c.getName());
    }
}
