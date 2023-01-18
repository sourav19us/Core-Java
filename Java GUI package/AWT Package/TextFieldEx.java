import java.awt.*;

public class TextFieldEx {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        TextField tf = new TextField("Enter Text", 25);
        f.add(tf);
        TextField tf2 = new TextField("Enter PassWord", 25);
        tf2.setEchoCharacter('@');
        f.add(tf2);
        f.setVisible(true);
    }
}
