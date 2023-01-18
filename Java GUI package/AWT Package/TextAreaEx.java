import java.awt.*;

public class TextAreaEx {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        TextArea ta = new TextArea("This is a text Area ", 25, 25, TextArea.SCROLLBARS_BOTH);
        f.add(ta);
        f.setVisible(true);
    }
}
