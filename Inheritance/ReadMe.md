```
class one{
    public void say(){
       System.out.println("Hello class one say()");
    }
    public static void dis(){
      System.out.println("Hello class one dis()");
    }
    public void get(){
        say();
        dis();
    }
}

class two extends one{
    public void say(){
       System.out.println("Hello class two");
    }
    public static void dis(){
      System.out.println("Hello class two dis()");
    }
}

public class InheritanceEx
{
	public static void main(String[] args) {
		one ref = new two();
		ref.say();
		ref.dis();
		ref.get(); // get() call class one static dis() methode
	}
}


>>>>>>>>>>

OutPut is

Hello class two
Hello class one dis()
Hello class two
Hello class one dis() // bcz static methodes call by get() and get() call class one static dis() methode

<<<<<<<<<<
```
