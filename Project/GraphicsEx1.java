import java.awt.*;
import java.awt.event.*;

public class GraphicsEx1 extends Frame implements MouseMotionListener {

    Panel p;

    public GraphicsEx1() {
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
        g.drawLine(0, 0, i, j);
        g.setColor(Color.BLUE);
        g.drawLine(399, 0, i, j);
        g.setColor(Color.red);
        g.drawLine(0, 499, i, j);
        g.setColor(Color.GREEN);
        g.drawLine(399, 499, i, j);
        g.setColor(Color.YELLOW);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    public void paint(Graphics g) {

    }

    public static void main(String[] args) {
        GraphicsEx1 g1 = new GraphicsEx1();
    }

}
