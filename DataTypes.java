public class DataTypes {

    public static void main(String[] args) {

        {// >>>>> Integers type datatype <<<<<
            /*
             * Signed data type
             * byte(1 byte),
             * short(2 byte),
             * int(4 byte),
             * long(8 byte)
             */

            int a = 12; // by default literal is int type
            a = 012; // octal literal
            // a=059; show complile time error bcz octal no star from 0 to 7
            a = 0x12; // hex literal
            System.out.println(a);

            // float b=12.5; // show complie time error bzc in floating -point type literal
            // value by defualt is double

            long b = 1256; // literal a int type so implicit typecast work.

            b = 1425l; // by using "l" and "L" literal type is long
            b = 14258L;

            byte c = 120;

            // byte d=189; show C.T erroe bcz byte range -128 to 127 only and "189" value is
            // out of range

            System.out.println(b);
            System.out.println(c);

            // byte e=a; // show C.T error bcz 'a' is var value

            final int q = 45;

            byte e = q; // ok

            // byte w=e+200; show error bcz literal value is out of range of byte
        }

        {

            // >>>>> floating-point type datatype <<<<<<

            /*
             * Signed data type
             * float (4 byte) & give 7 digits of accuracy
             * 
             * double (8 byte) & gives 17 digits of accuracy
             */

            // float a=12.5; show C.T Error bcz in floating-point datatype literal by
            // default value is double

            float a = 120.5f;
            a = 1289.48F;
            System.out.println(a);

            double b = 145.362;
            b = 1425.326d;
            b = 14259.326D;
            System.out.println(b);

        }
        {
            // Characters type datatype
            /*
             * char (2 bytes) unsigned data type
             */

            char ch = 'A';
            System.out.println(ch);

            char ch1 = 65; // ASCII value of 'A'=65
            System.out.println(ch1);

            ch1++;
            System.out.println(ch1);

            /*
             * ASCI (1 byte)
             * UNICODE (2 byte)
             */

        }
        {
            // boolean type datatype
            /*
             * boolean have tow value 'true' and 'false'
             */
            boolean bol = true;
            boolean bol1 = false;
            System.out.println(bol);
            System.out.println(bol1);
        }
    }
}
