public class BitwiseOperator {

    // **** note bitwise operators work with int datatype only ****

    // Bitwise Operators
    // 1. "&", (Bitwise AND operator): returns bit by bit AND of input values.
    // 2. "|", (Bitwise OR operator): returns bit by bit OR of input values.
    // 3. "^", (Bitwise XOR operator): returns bit-by-bit XOR of input values.
    // 4. "~", (Bitwise Complement Operator): This is a unary operator which returns
    // the one’s complement representation of the input value, i.e., with all bits
    // inverted.

    // short cut type = main + enter
    public static void main(String[] args) {

        {
            int a = 15;
            int b = 14;
            System.out.println("a&b = " + (a & b));
            System.out.println("a|b = " + (a | b));
            System.out.println("a^b = " + (a ^ b));
            System.out.println("~a = " + (~a));

        }

        // Shift Operators:
        // 1. "<<", Left shift operator: shifts the bits of the number to the left and
        // fills 0 on voids left as a result. Similar effect as multiplying the number
        // with some power of two.
        // 2. ">>", Signed Right shift operator: shifts the bits of the number to the
        // right and fills 0 on voids left as a result. The leftmost bit depends on the
        // sign of the initial number.Similar effect as dividing the number with some
        // power of two.
        // 3. ">>>", Unsigned Right shift operator: shifts the bits of the number to the
        // right and fills 0 on voids left as a result. The leftmost bit is set to 0.
        {
            int a = 5;
            System.out.println("a<<-5 = " + (a << (-5)));
            System.out.println("a<<5 = " + (a << 5));
            System.out.println("a<<6 = " + (a << 6));
            System.out.println("a>>-6 = " + (a >> -6));
            System.out.println("a>>6 = " + (a >> 6));
        }

        {
            int a = 145;
            int b = -25;

            System.out.println("a>>>4 = " + (a >>> 4));
            System.out.println("b>>>4 = " + (b >>> 4)); // gives large int value

        }

    }

}
