import java.awt.*;

public class PanelEx {
    public static void main(String args[]) {
        Frame f = new Frame("PanelEx");
        f.setSize(300, 500);
        f.setVisible(true);
        f.setLayout(new GridLayout(1, 2));
        Panel p1 = new Panel();
        p1.setBackground(Color.red);
        Panel p2 = new Panel();
        p1.add(new Label("Panel No. 1"));
        p2.add(new Label("Panel No. 2"));
        p2.setBackground(Color.green);
        f.add(p1);
        f.add(p2);
    }
}
