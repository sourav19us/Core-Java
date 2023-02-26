package InnerClassEx;

public class InnerClassEx {
    int a = 25;
    int y = 471;

    public class A {
        int z = 145;

        public void show() {
            System.out.println("a = " + a + " y = " + y + " z = " + z);
        }
    }
}

// in inner Class tow files make one is First.class and sec is
// First$Sec.class(for Inner Class)
