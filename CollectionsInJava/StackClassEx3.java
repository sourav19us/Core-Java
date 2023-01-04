import java.io.*;
import java.util.*;

public class StackClassEx3 {
    public static void main(String[] args) {
        Console con = System.console();
        Stack s = new Stack();
        char arr[];
        System.out.println("Enter Expression");
        String str = con.readLine();
        arr = (str.trim()).toCharArray();
        int a = 0;
        char strb[];
        for (int i = 0; i < (str.trim()).length(); i++) {
            if (Character.isDigit(arr[i])) {
                s.push(str.substring(i, i + 1));
            } else {
                a = i;
                break;
            }
        }
        // String str3 = String.copyValueOf(arr, 0, (a));
        System.out.println(s);

        for (int i = a; i < arr.length; i++) {
            // if (i > (arr.length - i)) {
            if (!s.empty()) {

                if (arr[i] == '+') {
                    String str3 = "" + s.pop();
                    int c = Integer.parseInt(str3);
                    if (!s.empty()) {
                        String str4 = "" + s.pop();
                        int d = Integer.parseInt(str4);
                        int e = c + d;
                        s.push(e);
                        System.out.println(s);
                        continue;
                    } else {
                        System.out.println("Expression Invalid");
                    }

                }
                if (arr[i] == '-') {
                    String str3 = "" + s.pop();
                    int c = Integer.parseInt(str3);
                    if (!s.empty()) {
                        String str4 = "" + s.pop();
                        int d = Integer.parseInt(str4);
                        int e = c - d;
                        s.push(e);
                        System.out.println(s);
                        continue;
                    } else {
                        System.out.println("Expression Invalid");
                    }

                }
                if (arr[i] == '/') {
                    String str3 = "" + s.pop();
                    int c = Integer.parseInt(str3);
                    if (!s.empty()) {
                        String str4 = "" + s.pop();
                        int d = Integer.parseInt(str4);
                        s.push((c / d));
                        System.out.println(s);
                        continue;
                    } else {
                        System.out.println("Expression Invalid");
                    }

                }
                if (arr[i] == '*') {
                    String str3 = "" + s.pop();
                    int c = Integer.parseInt(str3);
                    if (!s.empty()) {
                        String str4 = "" + s.pop();
                        int d = Integer.parseInt(str4);
                        s.push((c * d));
                        System.out.println(s);
                        continue;
                    } else {
                        System.out.println("Expression Invalid");
                    }

                }
                if (arr[i] == '%') {
                    String str3 = "" + s.pop();
                    int c = Integer.parseInt(str3);
                    if (!s.empty()) {
                        String str4 = "" + s.pop();
                        int d = Integer.parseInt(str4);
                        s.push((c % d));
                        System.out.println(s);
                        continue;
                    } else {
                        System.out.println("Expression Invalid");
                    }

                }
            } else {
                System.out.println("Enter Valid Expression");
                break;
            }
            // }
        }
        System.out.println(s);
    }
}
