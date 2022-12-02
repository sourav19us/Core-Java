import java.io.Console;

public class Arrays {
    public static void main(String[] args) {
        Console con = System.console();
        con.printf("enter size of array is ");
        int a = Integer.parseInt(con.readLine());
        int ary[];
        // ary[a+b*c/h]=25; // it`s ok
        ary = new int[a];
        for (int i = 0; i < ary.length; i++) {
            con.printf("Enter %d element of array :- ", (i + 1));
            try {
                ary[i] = Integer.parseInt(con.readLine());

            } catch (Exception e) {
                System.out.println(" Error msg is " + e);
                System.out.println("Enter integer value only");
            }
        }
        // for each loop
        int j = 1;
        for (int val : ary) {
            con.printf("Enter %d element is :- %d\n", j, val);
            j++;
        }

        // >>>>>>>>>> Initializing of Array <<<<<<<<<<<

        int ary1[] = { 15, 25, 36 };
        int ary2[] = new int[] { 15, 25, 36 };
        // int ary3[]=new int[3]{15,25,36}; // it`s C.T.Errore
        int ary3[] = ary;

        // >>>>>>>>>>>> Reusing Array Var <<<<<<<<<<
        int ary4[];

        ary4 = new int[5];

        ary4 = new int[7]; // Now array size is change and new array is created

        ary4 = new int[3]; // Now array size is change and new array is created

    }
}
