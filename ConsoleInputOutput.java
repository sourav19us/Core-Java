import java.io.*;

public class ConsoleInputOutput {
    public static void main(String[] args) {
        Console con = System.console();
        con.printf("enter no:-");
        String str;
        str = con.readLine();// readline() methode read String datatype so typecasting require
        con.printf(str);

        con.printf("enter no a = ");
        int a = Integer.parseInt(con.readLine());
        con.printf("enter no b = ");
        float b = Float.parseFloat(con.readLine());
        con.printf("enter no c = ");
        long c = Long.parseLong(con.readLine());
        con.printf("enter no d = ");
        double d = Double.parseDouble(con.readLine());

        /// >>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<
        System.out.println(">>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // >>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<
        con.printf(">>>>>>>>>>>>>>>>  <<<<<<<<<<<<<<<<<<<\n");
        con.printf("a = %5d\n", a);
        con.printf("b = %5.5f\n", b);
        con.printf("c = %5d\n", c);
        con.printf("d = %5.5f\n", d);

    }
}
