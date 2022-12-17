public class StringToInt {
    public static void main(String[] args) {
        int x;
        String s = "2526";

        x = Integer.parseInt(s);
        System.out.println("x = " + x);

        x = Integer.valueOf(s);
        System.out.println("x = " + x);
    }
}

// Java Convert String to int
// 1. public static int parseInt(String s) >>> static method of Integer class
// 2. public static int valueOf(String s) >>> static method of Integer class

// same as for Double ,Float ,Long