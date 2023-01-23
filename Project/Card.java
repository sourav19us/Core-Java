import java.awt.*;
import java.awt.event.*;

public class Card implements ActionListener {
    Frame f;
    Button b1, b2;
    Panel p1, p2, p3, p4, p5;
    TextField tf;
    Label l1, l2, l3, l4;
    TextField tf1, tf2, tf3, tf4;
    CardLayout cl = new CardLayout();

    public Card() {
        f = new Frame("LayoutEx2");
        f.setSize(500, 500);
        f.setVisible(true);
        BorderLayout bl = new BorderLayout();
        f.setLayout(new BorderLayout());
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();
        f.add(p1, BorderLayout.SOUTH);
        f.add(p2, BorderLayout.CENTER);
        b1 = new Button("Back");
        b2 = new Button("Next");
        p1.add(b1);
        p1.add(b2);
        p2.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.gridheight = 0;
        gbl.gridwidth = 0;
        gbl.weightx = 1.0;
        gbl.weighty = 1.0;
        l1 = new Label("Name");
        l2 = new Label("SurName");
        l3 = new Label("Age");
        l4 = new Label("Qualification");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();

        p2.add(l1, gbl);
        gbl.gridx = 1;
        gbl.gridy = 0;
        p2.add(tf1, gbl);

        gbl.gridx = 1;
        gbl.gridy = 0;
        p2.add(l2, gbl);
        gbl.gridx = 1;
        gbl.gridy = 1;
        p2.add(tf2, gbl);

        gbl.gridx = 2;
        gbl.gridy = 0;
        p2.add(l3, gbl);
        gbl.gridx = 2;
        gbl.gridy = 1;
        p2.add(tf3, gbl);

        gbl.gridx = 3;
        gbl.gridy = 0;
        p2.add(l4, gbl);
        gbl.gridx = 3;
        gbl.gridy = 1;
        p2.add(tf4, gbl);

    }

    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        Card c = new Card();

    }
}
