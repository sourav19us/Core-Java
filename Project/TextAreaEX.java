import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextAreaEX {
    TextArea ta;
    Frame f;

    public TextAreaEX() {
        f = new Frame("Editor");
        f.setSize(700, 500);
        f.setVisible(true);
        ta = new TextArea();
        f.add(ta);
    }

    public void setT() {
        ta.setEditable(true);
        ta.setText("Hello Sourav");
    }

    public void sel() {
        ta.select(1, 5);
    }

    public void selA() {
        ta.selectAll();
    }

    public void selG() {

        System.out.println("Start = " + ta.getSelectionStart() + "End = " + ta.getSelectionEnd());
    }

    public static void main(String[] args) {
        TextAreaEX tx = new TextAreaEX();
        tx.setT();
        tx.sel();
        tx.selG();
    }
}
