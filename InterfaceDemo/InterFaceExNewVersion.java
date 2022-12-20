interface one {
    void show();

    default void display() {
        System.out.println("interface one display() methode");
        msg();
    }

    // private instance method
    private void msg() {
        System.out.println("This is a Interface one msg");
    }

    static public void say() {
        System.out.println("static methode of two interface ");
    }
}

interface two {
    void show();

    default void display() {
        System.out.println("interface one display() methode");
        mail();
    }

    // private instance method
    private void mail() {
        System.out.println("This is a Interface two mail");
    }

    static public void say() {
        System.out.println("static methode of one interface ");
    }
}

// >>> 1 way
class voda implements one {
    public void show() {
        System.out.println("display() methode");
    }
    // Do not @Override default methode
}

// >>> 2 way

class vodaTow implements one {
    public void show() {
        System.out.println("show() methode");
    }

    // @Override default methode
    public void display() {
        System.out.println("display() methode");
    }
}

// >>> 3 way
abstract class vodaThree implements one {
    public void show() {
        System.out.println("show() methode");
    }

    // @Override default methode
    abstract public void display();
}

// if a class implements two interface and both interface have same default
// methode
// eg 1
class VodaThree implements one, two {
    // C.T Errore if default method not override bcz one interface and two interface
    // have same default methode so ambiguity occure
    public void show() {
        System.out.println("show() methode");
    }

    public void display() {
        System.out.println("VodaThree Class display() method");
    }
}

// eg 2
class VodaFour implements one, two {
    // to resolve ambiguity use
    public void show() {
        one.super.display();
        two.super.display();
    }

    public void display() {
        System.out.println("VodaThree Class display() method");
    }

}

public class InterFaceExNewVersion {

    public static void main(String[] args) {
        VodaThree ref = new VodaThree();
        ref.display();
        ref.show();
        one.say(); // interface one static methode

        VodaFour ref1 = new VodaFour();
        ref1.display();
        ref1.show();
        two.say(); // interface two static methode
    }
}
