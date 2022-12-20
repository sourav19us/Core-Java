interface one {
    void show();

    void get();
}

interface two extends one {
    void show();

    // int show(); // C.T Error
    void display();
}

interface three extends one, two {
    void show();

    void display();

    void output();
}

// class Demo implements tone ,two {
// class Demo extends Democlass2 implements tone ,two { // ok
class Demo implements three {

    // 4 methodes must be Override ( show() , get() , display() , output())

    // void show(){ // code } // C.T Error

    public void show() {
        System.out.println("Show() Methode");
    }

    public void get() {
        System.out.println("get() Methode");
    }

    public void display() {
        System.out.println("display() Methode");
    }

    public void output() {
        System.out.println("output() Methode");
    }
}

public class InterFaceDemoEx {
    public static void main(String[] args) {
        one ref = new Demo();
        ref.show();
        ref.get();

        two ref1 = new Demo();
        ref1.show();
        ref1.get();
        ref1.display();

        three ref2 = new Demo();
        ref2.show();
        ref2.get();
        ref2.display();
        ref2.output();

        Demo ref3 = new Demo();
        ref3.show();
        ref3.get();
        ref3.display();
        ref3.output();

        one ref4[] = new Demo[2];
        ref4[0] = new Demo();
        ref4[1] = new Demo();
        ref4[0].show();
        ref4[1].get();
    }
}