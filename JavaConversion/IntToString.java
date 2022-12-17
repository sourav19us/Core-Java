import javax.xml.transform.Source;

public class IntToString {
    public static void main(String[] args) {
        int x = 256142;
        String s;

        s = String.valueOf(x);
        System.out.println("String is " + s);

        s = Integer.toString(x);
        System.out.println("String is " + s);

        s = String.format("%d", x);
        System.out.println("String is " + s);

        // one more Methode
        s = "" + x;
        System.out.println("String is " + s);

        s = x + "";
        System.out.println("String is " + s);

        double y = 142.65;
        s = y + "";
        System.out.println("String is " + s);
    }
}
// Java Convert int to String

// 1. public static String valueOf(int i) >>> static method of String class

// 2. public static String toString(int i) >>> static method of Integer class

// 3. public static String format(String format, Object... args) >>> static
// method of String class

// same as for Double ,Float ,Long