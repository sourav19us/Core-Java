import java.awt.*;

import javax.swing.border.Border;

public class LayoutEx1 {
    public static void main(String[] args) {
        Frame f = new Frame("LayoutEx1");
        f.setSize(200, 200);
        f.setVisible(true);
        BorderLayout bl = new BorderLayout();
        f.setLayout(bl);
        Panel p1 = new Panel();
        p1.setBackground(Color.white);
        Panel p2 = new Panel();
        TextField tf = new TextField();
        p1.add(tf);
        GridLayout gl1 = new GridLayout(1, 1);
        p1.setLayout(gl1);
        GridLayout gl2 = new GridLayout(0, 4);
        p2.setLayout(gl2);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("+");
        Button b5 = new Button("4");
        Button b6 = new Button("5");
        Button b7 = new Button("6");
        Button b8 = new Button("-");
        Button b9 = new Button("7");
        Button b10 = new Button("8");
        Button b11 = new Button("9");
        Button b12 = new Button("*");
        Button b13 = new Button("C");
        Button b14 = new Button("0");
        Button b15 = new Button("/");
        Button b16 = new Button("=");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        bl.addLayoutComponent(p1, BorderLayout.NORTH);
        bl.addLayoutComponent(p2, BorderLayout.CENTER);

        p2.setBackground(Color.gray);
        f.add(p1);
        f.add(p2);
    }
}
