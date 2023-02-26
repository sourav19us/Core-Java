
public class ClassInMathodEx {
    int a = 10;

    public void display() {
        final int b = 150;
        final int c = 250;

        class D {
            int e = 666;

            public void show() {
                // only final variables of the enclosing Method
                System.out.println("b = " + b + " c = " + c + " e = " + e);
            }
        }
        // If method is difind within a class then we can create objects of the class
        // wthin that method only
        D ref = new D();
        ref.show();

    }
}
