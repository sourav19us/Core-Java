import java.awt.*;

public class GridBagLayoutEx {
    public static void main(String[] args) {
        Frame f = new Frame("GridBagLayout");
        f.setSize(300, 300);
        f.setLayout(new GridBagLayout());
        f.setVisible(true);

        Button b1 = new Button("ok");

        GridBagConstraints gbl = new GridBagConstraints();
        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.gridheight = 3;
        gbl.gridwidth = 3;
        gbl.weightx = 1.0;
        gbl.weighty = 1.0;
        Insets i = new Insets(5, 5, 5, 5);
        gbl.insets = i;
        gbl.fill = GridBagConstraints.HORIZONTAL;
        f.add(b1, gbl);
        Button b2 = new Button("ok");
        gbl.gridx = 3;
        gbl.gridy = 0;
        f.add(b2, gbl);
    }
}
