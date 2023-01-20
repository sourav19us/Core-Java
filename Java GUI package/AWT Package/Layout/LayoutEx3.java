import java.awt.*;

import javax.swing.border.Border;

public class LayoutEx3 {
    public static void main(String[] args) {
        Frame f = new Frame("LayoutEx3");
        f.setSize(250, 250);
        f.setVisible(true);
        // f.setBackground(Color.BLUE);
        // BorderLayout bl = new BorderLayout();
        GridLayout gl = new GridLayout(0, 1);
        f.setLayout(gl);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        Panel p6 = new Panel();
        Panel p7 = new Panel();
        // bl.addLayoutComponent(p1, BorderLayout.NORTH);
        // bl.addLayoutComponent(p2, BorderLayout.CENTER);
        // bl.addLayoutComponent(p3, BorderLayout.SOUTH);
        Label l1 = new Label("Q. Capital of Rajasthan ?", Label.LEFT);
        p1.add(l1);
        GridLayout gl2 = new GridLayout(0, 1);
        p2.setLayout(gl2);
        GridLayout gl4 = new GridLayout(0, 5);
        FlowLayout fl = new FlowLayout();
        p3.setLayout(gl4);
        p4.setLayout(gl4);
        p5.setLayout(gl4);
        p6.setLayout(gl4);
        GridLayout gl3 = new GridLayout(0, 4, 10, 10);
        p7.setLayout(gl3);
        Label l2 = new Label("A", Label.LEFT);
        Label l3 = new Label("B", Label.LEFT);
        Label l4 = new Label("C", Label.LEFT);
        Label l5 = new Label("D", Label.LEFT);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb5 = new Checkbox("Jaipur", true, cbg);
        Checkbox cb6 = new Checkbox("Ajmer", true, cbg);
        Checkbox cb7 = new Checkbox("Delhi", false, cbg);
        Checkbox cb8 = new Checkbox("Jodhur", true, cbg);

        p3.add(l2);
        p3.add(cb5);
        p4.add(l3);
        p4.add(cb6);
        p5.add(l4);
        p5.add(cb7);
        p6.add(l5);
        p6.add(cb8);
        p2.add(p3);
        p2.add(p4);
        p2.add(p5);
        p2.add(p6);
        p3.setBackground(Color.CYAN);
        // p4.setBackground(Color.CYAN);
        p5.setBackground(Color.CYAN);
        // p6.setBackground(Color.CYAN);

        Button b1 = new Button("Previous");
        Button b2 = new Button("Next");

        Label l = new Label();
        Label l10 = new Label();
        p7.add(l);
        p7.add(new Label());
        p7.add(new Label());
        p7.add(new Label());
        p7.add(new Label());
        p7.add(b1);
        p7.add(b2);
        p7.add(l10);
        p7.add(new Label());
        p7.add(new Label());
        p7.add(new Label());
        p7.add(new Label());
        p2.add(p7);
        p1.add(l1);
        f.add(p1);
        f.add(p2);
        f.add(p7);
        // f.add(p4);
        // f.add(p5);
        // f.add(p6);
        // f.add(p7);
    }
}
