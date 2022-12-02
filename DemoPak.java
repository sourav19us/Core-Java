import packages.Math.*;
// import packages.Math.Multiply; // ok 
import packages.*;

public class DemoPak {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sum(14, 15);
        Multiply obj2 = new Multiply();
        obj2.multiply(14, 96);
        Sub obj3 = new Sub();
        obj3.sub(12, 63);
        System.out.println();
    }
}
