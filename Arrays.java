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

        // >>>>>>>>>>>> 2D Array <<<<<<<<<<<<<<<
        int arr3[][]; // int []arr3[]; // int [][]arr3;
        arr3 = new int[3][3];

        int arr4[][] = { { 1, 5, 2 }, { 14, 9 }, { 4, 9, 3, 89 } };
        System.out.println(arr4.length);
        System.out.println(arr4[0].length);
        for (int i = 0; i < arr4.length; i++) {
            for (int q = 0; q < arr4[i].length; q++) {
                System.out.print(arr4[i][q] + " ");
            }
            System.out.println();
        }

        // >>>>>>>>>> 3D Array / Jagged Array <<<<<<<<<<<<<

        int arr5[][][] = new int[][][] { { { 1, 5, 2 }, { 14, 9 }, { 4, 9, 3, 89 } },
                { { 1, 5, 2 }, { 14, 9 }, { 4, 9, 3, 89 } } };

        int arr6[][][] = new int[2][][];
        arr6[0] = new int[2][6];
        arr6[1] = new int[3][5];

        int arr7[][][] = new int[2][][]; // 2 is no of table
        arr7[0] = new int[3][]; // arr7[a] = new int[b][]; a is table no. ,b is row no.
        arr7[0][0] = new int[5]; // arr7[a][b] = new int[c]; a is table no. ,b is row no. ,c is
        // element in rows
        arr7[0][1] = new int[15];
        arr7[0][2] = new int[13];
        arr7[1] = new int[3][];
        arr7[1][0] = new int[5];
        arr7[1][1] = new int[15];
        arr7[1][2] = new int[13];

        for (int i = 0; i < arr5.length; i++) {
            System.out.println("Table no :-" + (i + 1));
            for (int q = 0; q < arr5[i].length; q++) {
                for (int w = 0; w < arr5[i][q].length; w++) {
                    System.out.print(arr5[i][q][w] + " ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr7.length; i++) {
            System.out.println("Table no :-" + (i + 1));
            for (int q = 0; q < arr7[i].length; q++) {
                for (int w = 0; w < arr7[i][q].length; w++) {
                    arr7[i][q][w] = (int) (Math.random() * 100);
                    System.out.print(arr7[i][q][w] + " ");
                }
                System.out.println();
            }
        }

    }
}
