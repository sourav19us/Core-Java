import java.awt.*;
import java.awt.event.*;

public class Card implements ActionListener {
    Frame f;
    Button b1, b2;
    Panel p1, p2, p3, p4, p5, p6;
    TextField tf;
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    TextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16;
    CardLayout cl;

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
        p6 = new Panel();
        f.add(p1, BorderLayout.SOUTH);
        f.add(p3, BorderLayout.CENTER);
        cl = new CardLayout();
        p3.setLayout(cl);
        b1 = new Button("Back");
        b2 = new Button("Next");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p1.add(b1);
        p1.add(b2);
        p2.setLayout(new GridBagLayout());
        p4.setLayout(new GridBagLayout());
        p5.setLayout(new GridBagLayout());
        p6.setLayout(new GridBagLayout());

        l1 = new Label("Name");
        l2 = new Label("SurName");
        l3 = new Label("Age");
        l4 = new Label("Qualification");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf4 = new TextField(20);

        l5 = new Label("H.No");
        l6 = new Label("Area");
        l7 = new Label("City");
        l8 = new Label("State");
        tf5 = new TextField(20);
        tf6 = new TextField(20);
        tf7 = new TextField(20);
        tf8 = new TextField(20);

        l9 = new Label("PinCode");
        l10 = new Label("Phone");
        l11 = new Label("Mobile");
        l12 = new Label("Email");
        tf9 = new TextField(20);
        tf10 = new TextField(20);
        tf11 = new TextField(20);
        tf12 = new TextField(20);

        l13 = new Label("Salary");
        l14 = new Label("H.R.A");
        l15 = new Label("T.A");
        l16 = new Label("D.A");
        tf13 = new TextField(20);
        tf14 = new TextField(20);
        tf15 = new TextField(20);
        tf16 = new TextField(20);

        GridBagConstraints gbl = new GridBagConstraints();

        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.weightx = 1.0;
        gbl.weighty = 1.0;
        p2.add(l1, gbl);
        gbl.gridx = 1;
        gbl.gridy = 0;
        p2.add(tf1, gbl);

        gbl.gridx = 0;
        gbl.gridy = 1;
        p2.add(l2, gbl);
        gbl.gridx = 1;
        gbl.gridy = 1;
        p2.add(tf2, gbl);

        gbl.gridx = 0;
        gbl.gridy = 2;
        p2.add(l3, gbl);
        gbl.gridx = 1;
        gbl.gridy = 2;
        p2.add(tf3, gbl);

        gbl.gridx = 0;
        gbl.gridy = 3;
        p2.add(l4, gbl);
        gbl.gridx = 1;
        gbl.gridy = 3;
        p2.add(tf4, gbl);

        p3.add(p2, "1");

        GridBagConstraints gbl2 = new GridBagConstraints();
        gbl2.gridx = 0;
        gbl2.gridy = 0;
        gbl2.weightx = 1.0;
        gbl2.weighty = 1.0;
        p4.add(l5, gbl2);
        gbl2.gridx = 1;
        gbl2.gridy = 0;
        p4.add(tf5, gbl2);

        gbl2.gridx = 0;
        gbl2.gridy = 1;
        p4.add(l6, gbl2);
        gbl2.gridx = 1;
        gbl2.gridy = 1;
        p4.add(tf6, gbl2);

        gbl2.gridx = 0;
        gbl2.gridy = 2;
        p4.add(l7, gbl2);
        gbl2.gridx = 1;
        gbl2.gridy = 2;
        p4.add(tf7, gbl2);

        gbl2.gridx = 0;
        gbl2.gridy = 3;
        p4.add(l8, gbl2);
        gbl2.gridx = 1;
        gbl2.gridy = 3;
        p4.add(tf8, gbl2);
        p3.add(p4, "2");
        cl.last(p3);

        GridBagConstraints gbl3 = new GridBagConstraints();
        gbl3.gridx = 0;
        gbl3.gridy = 0;
        gbl3.weightx = 1.0;
        gbl3.weighty = 1.0;
        p5.add(l9, gbl3);
        gbl3.gridx = 1;
        gbl3.gridy = 0;
        p5.add(tf9, gbl3);

        gbl3.gridx = 0;
        gbl3.gridy = 1;
        p5.add(l10, gbl3);
        gbl3.gridx = 1;
        gbl3.gridy = 1;
        p5.add(tf10, gbl3);

        gbl3.gridx = 0;
        gbl3.gridy = 2;
        p5.add(l11, gbl3);
        gbl3.gridx = 1;
        gbl3.gridy = 2;
        p5.add(tf11, gbl3);

        gbl3.gridx = 0;
        gbl3.gridy = 3;
        p5.add(l12, gbl3);
        gbl3.gridx = 1;
        gbl3.gridy = 3;
        p5.add(tf12, gbl3);
        p3.add(p5, "3");

        GridBagConstraints gbl4 = new GridBagConstraints();
        gbl4.gridx = 0;
        gbl4.gridy = 0;
        gbl4.weightx = 1.0;
        gbl4.weighty = 1.0;
        p6.add(l13, gbl4);
        gbl4.gridx = 1;
        gbl4.gridy = 0;
        p6.add(tf13, gbl4);

        gbl4.gridx = 0;
        gbl4.gridy = 1;
        p6.add(l14, gbl4);
        gbl4.gridx = 1;
        gbl4.gridy = 1;
        p6.add(tf14, gbl4);

        gbl4.gridx = 0;
        gbl4.gridy = 2;
        p6.add(l15, gbl4);
        gbl4.gridx = 1;
        gbl4.gridy = 2;
        p6.add(tf15, gbl4);

        gbl4.gridx = 0;
        gbl4.gridy = 3;
        p6.add(l16, gbl4);
        gbl4.gridx = 1;
        gbl4.gridy = 3;
        p6.add(tf16, gbl4);
        p3.add(p6, "4");
        cl.first(p3);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Back")) {
            cl.previous(p3);
            System.out.println("Back");
        } else {
            if (str.equals("Next")) {
                cl.next(p3);
                System.out.println("next");
            } else {
                cl.first(p3);
                System.out.println("first");
            }
        }
    }

    public static void main(String[] args) {
        Card c = new Card();

    }
}
