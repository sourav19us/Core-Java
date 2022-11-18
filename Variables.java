
// class name start with capital alphabet

public class Variables {

    static int _aVar = 14;

    // >>>>>>>>>>>>>>>>>>> <<<<<<<<<<<<<<<<<<<<<<<<<

    double Pno = 91_8952;
    double Pno1 = 9_1_8_5_2;
    // double Pno = _91_8952; // compile time error
    // double Pno1 = 9_1_8_5_2_; // compile time error

    int $avar = 145;

    int max = 145, Max = 145, mAx = 145;

    int avar$ = 145;

    int ava$as = 145;

    int While = 145; // java is case sensitive language "while" is a key-Word , "w" is small alphabet

    final float pi = 3.14f; // "final" is a key-word constant pi value , now pi value can not change

    // experation

    int a = 4 + 58; // Evaluated at complie time

    float b = pi + 58; // Evaluated at complie time

    int c = a + 4 + 45 * 84 / 5; // Evaluated at run time

    /*
     * 
     * Worng Var (Identifiers) and show complile time error
     * 
     * int 1avar=145;
     * 
     * int var@12=145;
     * 
     * int ab cd=145;
     * 
     * int ab+vf=145;
     */

    public static void main(String[] args) {

        Variables obj = new Variables();

        System.out.println(_aVar);
        System.out.println(obj.mAx);

    }

}
