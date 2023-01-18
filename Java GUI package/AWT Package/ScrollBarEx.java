import java.awt.*;

public class ScrollBarEx {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 25, 2, 0, 100);
        f.add(sb);
        f.setVisible(true);
    }
}
