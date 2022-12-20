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
    public void get(){
        say();
        dis();
    }
}

public class InheritanceEx
{
	public static void main(String[] args) {
		one ref = new two();
		ref.say();
		ref.dis();
		ref.get();
	}
}