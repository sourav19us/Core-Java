import java.awt.*;

public class LayoutEx4 {
    public static void main(String[] args) {
        Frame f = new Frame("LayoutEx4");
        f.setSize(250, 250);
        f.setVisible(true);
        GridLayout gl = new GridLayout(0, 2);
        f.setLayout(gl);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p31 = new Panel();
        Panel p32 = new Panel();
        Panel p41 = new Panel();
        Panel p42 = new Panel();

        GridLayout gl1 = new GridLayout(0, 1);
        p1.setLayout(gl1);
        p1.add(new Label("1", Label.CENTER));
        p1.add(new Label("2", Label.CENTER));

        GridLayout gl2 = new GridLayout(1, 0);
        p2.setLayout(gl2);
        p2.add(new Label("3", Label.CENTER));
        p2.add(new Label("4", Label.CENTER));
        p2.add(new Label("5", Label.CENTER));

        GridLayout gl3 = new GridLayout(1, 0);
        p2.setLayout(gl3);
        p2.add(p31);
        p2.add(p32);

        GridLayout gl4 = new GridLayout(0, 1);
        p31.setLayout(gl4);
        p31.add(new Label("6", Label.CENTER));
        p31.add(new Label("7", Label.CENTER));
        GridLayout gl5 = new GridLayout(0, 1);
        p32.setLayout(gl5);
        p32.add(new Label("8", Label.CENTER));
        p32.add(new Label("9", Label.CENTER));
        p32.add(new Label("10", Label.CENTER));
        p3.add(p31);
        p3.add(p32);
        GridLayout gl6 = new GridLayout(1, 0);
        p41.setLayout(gl6);
        p41.add(new Label("11", Label.CENTER));
        p41.add(new Label("12", Label.CENTER));
        GridLayout gl7 = new GridLayout(1, 0);
        p42.setLayout(gl7);
        p42.add(new Label("13", Label.CENTER));
        p42.add(new Label("14", Label.CENTER));
        p42.add(new Label("15", Label.CENTER));
        p4.add(p41);
        p4.add(p42);

        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
    }
}
