import java.awt.*;

public class ChoiceEx {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        Choice c = new Choice();
        c.add("C");
        c.add("C++");
        c.add("Python");
        c.add("Java");
        c.add("MatLab");
        c.add("Select");
        c.select(5);
        f.add(c);
        f.setVisible(true);
    }
}
