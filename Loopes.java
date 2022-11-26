import java.io.*;

public class Loopes {
    public static void main(String[] args) {
        Console con = System.console();
        con.printf("Enter a no :- ");
        int a = Integer.parseInt(con.readLine());
        // System.out.println("enter PassWord :- ");
        // char Pstr[] = con.readPassword();
        System.out.println("a = " + a);

        // >>>>>>>>>> FOR Loop <<<<<<<<<<<<<<<<

        // for(int i=0;i<=10;i++){} // ok

        // for ( ; ; ) { } // ok

        int i = 0;

        // for(;i<=10;){} // ok // loop is infinity bcz "i" value is not increase

        // for(;i<=10;i++){} // ok // loop is not infinity

        int Sum = 0;

        // ****** j var datatype byte ,short ,int ,long ,float ,double *******

        for (int j = 0, sum = 0; j < 10; j++, sum = sum + j, Sum = sum) {
        }
        System.out.println(Sum); // o/p is 55
        for (int j = 0, sum = 0; j < 10; sum = sum + j, Sum = sum, j++) {
        }
        System.out.println(Sum); // o/p is 45

        // >>>>>>>>>> WHILE Loop <<<<<<<<<<<<<<
        // while(boolean expr)
        int c = 0;
        // while (true) {
        // c++;
        // }
        System.out.println("while loop");
        while (c <= 10) {
            System.out.println(c); // o/p 0 to 10
            c++;
        }

        // >>>>>>>>>>>>>> DO-----While Loop <<<<<<<<<
        c = 0;
        System.out.println("Do --- while loop");
        do {
            System.out.println(c);
            c++;
        } while (c <= 10); // o/p 0 to 11

        // >>>>>>>>>>>> Labelled Continue AND Labelled Break <<<<<<<<<<<<
        System.out.println("Labelled Continue AND Labelled Break");
        one: for (int j = 0; j <= 10; j++) {
            int tot = 0;
            two: for (int q = 0; q <= 10; q++) {
                tot = j + q;
                if (j == 5) {
                    break one; // lablled Breack
                }
                if (j == 2) {
                    continue two; // lablled Continue
                }
            }
            System.out.println(tot);
        }
    }

}
