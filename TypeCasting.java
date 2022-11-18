public class TypeCasting {

    public static void main() {
        int a = 15;
        double b = 3.14;

        // a=b; show complile time error bcz Narrowing of DataType is not Allowed

        a = (int) b; // explicit TypeCasting

        // double <- int
        b = a; // windening of datatype , implicit TypeCasting

        /*
         * // byte -> short -> char -> int -> long -> float -> double >>>> Widening
         * TypeCasting <<<<<<
         * 
         * 
         * // byte <- short <- char <- int <- long <- float <- double >>>> Narrowing
         * TypeCasting <<<<<<
         * 
         */
    }
}