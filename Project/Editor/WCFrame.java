import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class WCFrame extends WindowAdapter implements ActionListener {

    Frame fc;

    public WCFrame() {
        fc = new Frame("Window Closing");
        fc.setSize(500, 120);
        fc.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.weightx = 1.0;
        gbl.weighty = 1.0;
        // gbl.anchor = GridBagConstraints.WEST;
        Label l = new Label("Do You Want to Save");
        fc.add(l);
        fc.add(l);
        Button b1 = new Button("Save");
        b1.addActionListener(this);
        gbl.gridx = 0;
        gbl.gridy = 1;
        fc.add(b1, gbl);
        Button b2 = new Button("Don't Save");
        b2.addActionListener(this);
        gbl.gridx = 1;
        gbl.gridy = 1;
        fc.add(b2, gbl);
        Button b3 = new Button("Cancel");
        b3.addActionListener(this);
        gbl.gridx = 2;
        gbl.gridy = 1;
        fc.add(b3, gbl);
        // f1.setFocusableWindowState(false);
        fc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'actionPerformed'");
        String str = e1.getActionCommand();
        System.out.println(str + " was clicked");
        if (str.equals("Save")) {
            if (Editor.getTAstr() != null) {
                fc.setVisible(false);

                if (!Editor.getTAstr().equals(Editor.getTextArea().getText())) {

                    Editor.save();
                    if (!Editor.getspath().equals("nullnull")) {
                        System.out.println("Clicked on Windowclosing");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Clicked on Windowclosing");
                    System.exit(0);

                }
            }
        }

        if (str.equals("Don't Save")) {
            System.exit(0);
        }

        if (str.equals("Cancel")) {
            fc.setVisible(false);
        }
    }

}
