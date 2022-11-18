public class Literals {

    // integar literals
    {

        int a = 8; // in decimal
        int b = 010; // "8" in Octal
        int c = 0x8; // "8" in Hexadecimal
    }

    // floating-point literals

    // 1. double literals
    {
        double a = 0.04;
        double b = 0.04d;
        double c = 0D;
        double e = 49D;
        double f = 4.9e-2; // 4.9e-2d
        double g = 4.9E+2;
    }

    // 2. float literals

    {
        float a = .49f;
        float b = .49F;
        float e = 0.49e-5f;// 0.49E-5F
    }

    // boolean literals

    {
        boolean a = true;
        boolean b = false;
    }

    // character literals

    {
        char ch = 'a';
        char ch1 = '\u0061'; // 'a' in unicode value
    }

    /*
     * 
     * \b = \u0008 = Backspace (BS)
     * \t = \u0009 = Horizontal tab (HT or TAB)
     * \n = \u000a = Linefeed (LF) a.k.a. Newline (NL)
     * \f = \u000c = Form feed (FF)
     * \r = \u000d = Carriage return (CR)
     * \' = \u0027 = Apostrophe-quote, a.k.a. single quote
     * \" = \u0022 = Quotation mark, a.k.a. double quote
     * \\ = \u005c = Backslash
     */

    // String literal

    String str = "Hello Sourav";
    String str1 = "Hello \n Sourav";
    String str2 = "Hello \u0009 Sourav";
    static String str3 = "Hello \" Sourav \" ";

    public static void main(String[] args) {

        System.out.println(str3);
    }
}
