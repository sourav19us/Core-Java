import java.awt.*;

public class LabelEx {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        Label l = new Label("Enter Your Name", Label.CENTER);
        f.add(l);
        f.setVisible(true);
    }
}
