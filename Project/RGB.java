import java.awt.*;
import java.awt.event.*;

public class RGB implements AdjustmentListener {
    Frame f;
    Scrollbar sb1, sb2, sb3;
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    Panel p1, p2, p3;
    Color myColor;
    int rv, gv, bv;

    public RGB() {
        f = new Frame("LayoutEx2");
        f.setSize(500, 500);
        f.setVisible(true);
        BorderLayout bl = new BorderLayout();
        f.setLayout(new BorderLayout());
        sb1 = new Scrollbar(Scrollbar.VERTICAL, 10, 5, 0, 260);
        sb2 = new Scrollbar(Scrollbar.VERTICAL, 90, 5, 0, 260);
        sb3 = new Scrollbar(Scrollbar.VERTICAL, 40, 5, 0, 260);
        GridLayout gl = new GridLayout(1, 0);
        p1 = new Panel();
        p1.setLayout(gl);
        p1.add(sb1);
        p1.add(sb2);
        p1.add(sb3);
        f.add(p1, BorderLayout.EAST);
        p2 = new Panel();
        p3 = new Panel();
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        l1 = new Label("R Value");
        l2 = new Label("G Value");
        l3 = new Label("B Value");
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p2.add(l3);
        p2.add(tf3);
        rv = sb1.getValue();
        gv = sb2.getValue();
        bv = sb3.getValue();
        myColor = new Color(rv, gv, bv);
        tf1.setText(rv + "");
        tf2.setText(gv + "");
        tf3.setText(bv + "");
        p3.setBackground(myColor);
        p2.setBackground(Color.WHITE);
        f.add(p3, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);

    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        rv = sb1.getValue();
        gv = sb2.getValue();
        bv = sb3.getValue();
        tf1.setText(rv + "");
        tf2.setText(gv + "");
        tf3.setText(bv + "");
        myColor = new Color(rv, gv, bv);
        p3.setBackground(myColor);
        System.out.println(sb1.getValue() + " " + sb2.getValue() + " " + sb3.getValue());
    }

    public static void main(String[] args) {
        RGB r = new RGB();
    }
}
