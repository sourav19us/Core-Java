public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operator

        {
            int a = 145;
            int b = 482;
            System.out.println("a+b=" + (a + b));
            System.out.println("a-b=" + (a - b));
            System.out.println("a*b=" + (a * b));
            System.out.println("a/b=" + (a / b));
            System.out.println("a%b=" + (a % b));
        }

        {

            byte a = 14;
            byte b = 48;
            // byte c=a+b;// show C.T Error bcz a and b literales are int type and Narrowing
            // in java not allow
            // Arithmetic Operator operter workon 32bit or more size of datatype without
            // typeCasting
            byte c = (byte) (a + b);
            System.out.println("c=" + c);
        }

        // Unary Operators
        {
            int a = 4;
            a++;
            System.out.println(a); // output is "4"
            a = a + 1;
            System.out.println(a);// output is "6"
        }

        {
            float a = 1 / 3;
            System.out.println(a); // output is "0" bcz literales is int type

            // float a=1.0/3; // C.T Error bcz literales are double type

            float b = 1.0f / 3;
            System.out.println(b);
        }

        {
            int a = 4, b;
            // if(a==4)// a is var , "a==4" experation evaluated at run time so b=14; code
            // not work ,
            // {
            // b=14;
            // }
            // System.out.println(b);

            if (a == 4) {
                b = 14;
            } else {
                b = 458;
            }
            System.out.println(b);

            // >>>>>>>>>>> OR <<<<<<<<<<<<

            final int c = 14;

            if (c == 14) // c is cont var so "c==14" experation evaluated at compile time and b=14527;
                         // code work
            {
                b = 14527;
            }
            System.out.println(b);

        }
    }

}
