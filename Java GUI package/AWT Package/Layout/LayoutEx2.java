import java.awt.*;

import javax.swing.border.Border;

public class LayoutEx2 {
    public static void main(String[] args) {
        Frame f = new Frame("LayoutEx2");
        f.setSize(500, 500);
        f.setVisible(true);
        BorderLayout bl = new BorderLayout();
        f.setLayout(bl);
        Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 5, 0, 100);
        Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL, 90, 5, 0, 100);
        Scrollbar sb3 = new Scrollbar(Scrollbar.VERTICAL, 40, 5, 0, 100);
        Panel p = new Panel();
        GridLayout gl = new GridLayout(1, 5, 1, 1);
        p.setLayout(gl);
        p.add(sb1);
        p.add(sb2);
        p.add(sb3);
        p.setBackground(Color.BLACK);
        f.add(p, BorderLayout.EAST);
        Panel p2 = new Panel();
        p2.add(new Label());
        p2.setBackground(Color.WHITE);
        f.add(p2, BorderLayout.CENTER);
        f.add(p);
        f.add(p2);

    }
}
