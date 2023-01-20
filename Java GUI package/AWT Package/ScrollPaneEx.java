import java.awt.*;

public class ScrollPaneEx {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        f.setTitle("ScrollPaneEx");
        ScrollPane br = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
        Button b = new Button("OK");
        b.setFont(new Font("Arial", Font.BOLD, 100));
        br.add(b);
        f.add(br);
        f.setVisible(true);
    }
}
