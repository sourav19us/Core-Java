import java.awt.*;

public class ListEx {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        List l = new List(3, true);
        l.add("C");
        l.add("C++");
        l.add("Python");
        l.add("Java");
        l.add("MatLab");
        l.add("HTML");
        f.add(l);
        f.setVisible(true);
    }
}
