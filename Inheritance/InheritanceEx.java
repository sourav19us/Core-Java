class one {
  public void say() {
    System.out.println("Hello class one say()");
  }

  public static void dis() {
    System.out.println("Hello class one dis()");
  }

  public void get() {
    say();
    dis();
  }
}

class two extends one {
  public void say() {
    System.out.println("Hello class two");
  }

  public static void dis() {
    System.out.println("Hello class two dis()");
  }

  public void get() {
    say();
    dis();
  }
}

public class InheritanceEx {
  public static void main(String[] args) {
    one ref = new two();
    ref.say();
    ref.dis();
    ref.get();

    // we can also call class method by that way
    new two().get(); // ok class two get method call

    // object type casting
    two ref1;
    ref1 = (two) ref; // object to object typecasting
    ref1.say();
    ref1.dis();
    ref1.get();
  }
}