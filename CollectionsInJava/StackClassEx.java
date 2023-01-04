import java.io.*;
import java.util.*;

public class StackClassEx {

    public static void main(String[] args) {
        Console con = System.console();

        Stack s = new Stack();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Name " + i + " :-");
            String str = con.readLine();
            s.push(str);
        }
        System.out.println(s.peek());
        // System.out.println("Index Value of java5 is " + s.search("java5"));
        // System.out.println("Index Value of java1 is " + s.search("java1"));
        // System.out.println("Index Value of java10 is " + s.search("java10"));
        System.out.println(s);
        for (boolean b = true; b == !(s.empty());) {
            // while (!s.empty()) {
            System.out.println(s.pop());
            // }
            System.out.println(s);
        }
        System.out.println(s);

        Stack s1 = new Stack();
        for (int i = 1; i <= 10; i++) {

            String str = "Python" + i;
            s1.push(str);
        }
        System.out.println(s1);
        for (int i = 1; i <= 10; i++) {
            String st = "Python" + 1;
            System.out.println("Index value " + s1.search(st) + " is " + s1.pop() + " ");

        }

    }
}