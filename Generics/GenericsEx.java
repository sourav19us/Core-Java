class GncEx<T1, T2> {
    private T1 x;
    private T2 y;

    public GncEx(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 getx() {
        return x;
    }

    public T2 gety() {
        return y;
    }
}

public class GenericsEx {
    public static void main(String[] args) {

        GncEx<String, String> ref1 = new GncEx<String, String>("sourav", "saini");
        System.out.println(ref1.getx());
        System.out.println(ref1.gety());
        GncEx<Integer, Integer> ref2 = new GncEx<Integer, Integer>(253, 3625);
        System.out.println(ref2.getx());
        System.out.println(ref2.gety());
        GncEx<Integer, Float> ref3 = new GncEx<Integer, Float>(253, 3625.326f);
        System.out.println(ref3.getx());
        System.out.println(ref3.gety());
    }
}

// at T1 and T2 Class Name ,Interface Name and
// ArrayList<int[]> a = new ArrayList<>(); // ok