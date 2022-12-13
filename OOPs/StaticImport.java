// >>>>>>>>>>> Static Import <<<<<<<<<<<<<
// Static import is a feature introduced in Java programming language ( versions
// 5 and above ) that allows members ( fields and methods ) defined in a class
// as public static to be used in Java code without specifying the class in
// which the field is defined.

// eg  import static java.lang.System.*;

import static java.lang.Math.*; //static import in demend " Math class all static methodes import"
// import static java.lang.Math.random; //single static import " Math class random() static methodes import"

public class StaticImport {
    public static void main(String[] args) {
        int no;
        no = (int) (random() * 100);
        System.out.println(sqrt(no));
    }
}
