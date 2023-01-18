import java.awt.*;

public class ButtonEx {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        Button b1 = new Button("ok");
        f.add(b1);
        Button b2 = new Button("Submit");
        f.add(b2);
        f.setVisible(true);
    }
}
