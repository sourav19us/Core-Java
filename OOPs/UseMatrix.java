import java.io.Console;

public class UseMatrix {
    public static void main(String[] args) {
        Matrix ref1 = new Matrix();
        ref1.get();
        Console con = System.console();
        int a1, b1;
        System.out.print("Enter No of Rows :- ");
        a1 = Integer.parseInt(con.readLine());
        System.out.print("Enter No of Elements in the Rows :- ");
        b1 = Integer.parseInt(con.readLine());
        Matrix ref2 = new Matrix(a1, b1);
        ref2.get();
        System.out.println("Copy Constructor :-");
        Matrix ref3 = new Matrix(ref2);
        ref3.get();

    }
}
