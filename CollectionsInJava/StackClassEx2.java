import java.io.*;
import java.util.*;

public class StackClassEx2 {
    public static void main(String[] args) {
        Console con = System.console();
        Stack s = new Stack();
        char arr[];
        System.out.println("Enter Expression");
        String str = con.readLine();
        arr = (str.trim()).toCharArray();
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                s.push(arr[i]);
            } else if (arr[i] == ')') {
                if (!(s.empty())) {
                    s.pop();
                } else {
                    a++;
                }
            }
        }
        if (a == 0 && s.empty()) {
            System.out.println("Expression ok");
        }
        if (a > 0) {
            System.out.println("Left '(' Parenthesis Missing");
        }
        if (!(s.empty())) {
            System.out.println("Right ')'  Parenthesis Missing");
        }
    }
}
