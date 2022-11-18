
/**
 * Demo
 */
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("hello");
        System.out.println("Enter your full name");

        String name = sc.nextLine();

        System.out.print("Enter name is \n" + name);

        System.out.print("enter a =");
        int a = sc.nextInt();
        System.out.print("enter b =");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("a+b=" + sum);

        if (a % 2 == 0) {
            System.out.println(a + "  is even num");
        } else {
            System.out.println(a + "  is odd num");
        }

        if (b % 2 == 0) {
            System.out.println(b + "  is even num");
        } else {
            System.out.println(b + "  is odd num");
        }
        // System.out.println(); // syso + enter

        if (a > b) {
            System.out.println(a + " >   " + b);
        } else if (a == b) {
            System.out.println(a + " >   " + b);
        } else {
            System.out.println(a + " =   " + b);
        }

    }
}