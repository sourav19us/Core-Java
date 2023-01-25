import java.awt.*;
import java.awt.event.*;

public class GraphicsEx2 extends Frame implements MouseMotionListener {
    Panel p;

    public GraphicsEx2() {
        setSize(400, 500);
        setVisible(true);
        p = new Panel();
        p.addMouseMotionListener(this);
        add(p);
    }

    public void mouseMoved(MouseEvent e1) {
        int i, j;
        i = e1.getX();
        j = e1.getY();
        // System.out.println("i= " + i + "j = " + j);
        Graphics g = p.getGraphics();
        g.drawLine(i, j, i, j);
        g.setColor(Color.BLUE);
    }

    public void mouseDragged(MouseEvent e) {

    }

    public static void main(String[] args) {
        GraphicsEx2 g1 = new GraphicsEx2();
    }
}
