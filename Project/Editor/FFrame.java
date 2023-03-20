// package Editor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Vector;
import java.util.regex.*;

public class FFrame extends WindowAdapter implements ActionListener {
    static Frame f1;
    TextField tf;
    Vector<Integer> vec1 = new Vector<Integer>();
    Vector<Integer> vec2 = new Vector<Integer>();
    int i = 0, index = 0;
    String st3;

    public FFrame() {
        f1 = new Frame();
        f1 = new Frame("Find");
        f1.setSize(500, 120);
        f1.setLayout(new GridBagLayout());
        GridBagConstraints gbl = new GridBagConstraints();
        gbl.gridx = 0;
        gbl.gridy = 0;
        gbl.weightx = 1.0;
        gbl.weighty = 1.0;
        gbl.anchor = GridBagConstraints.WEST;
        Label l = new Label("Find");
        f1.add(l, gbl);
        tf = new TextField(15);
        gbl.gridx = 0;
        gbl.gridy = 1;
        f1.add(tf, gbl);
        Button b1 = new Button("FindNext");
        b1.addActionListener(this);
        gbl.gridx = 0;
        gbl.gridy = 2;
        f1.add(b1, gbl);
        Button b2 = new Button("Close");
        b2.addActionListener(this);
        gbl.gridx = 1;
        gbl.gridy = 2;
        f1.add(b2, gbl);
        // f1.setFocusableWindowState(false);
        f1.setVisible(true);

    }

    public static Frame getEFrame() {
        return f1;
    }

    public void actionPerformed(ActionEvent e3) {
        String str = e3.getActionCommand();
        System.out.println(str + " was clicked");
        if (str.equals("Close")) {

            // System.exit(1);
            vec1.clear();
            vec2.clear();
            f1.setVisible(false);
        }
        if (str.equals("FindNext")) {

            TextArea ta1 = Editor.getTextArea();
            String st = ta1.getText();
            String st2 = tf.getText();
            st = st.replace("\r", "");
            st = st.replace("\n", " ");
            // Pattern p = Pattern.compile(st2);
            // Matcher m = p.matcher(st);

            // while (m.find()) {

            // // System.out.println(m.start() + " " + m.end() + " " + m.group());
            // vec1.add(m.start());
            // vec2.add(m.end());
            // }

            // System.out.println(vec1.size());
            // System.out.println(vec2.size());
            // if (i < vec1.size()) {
            // Editor.getTextArea().select(vec1.get(0), vec2.get(0));

            // if (vec1.size() != 0) {

            // if (i < (vec1.size())) {
            // Editor.getTextArea().select(vec1.get(i), vec2.get(i));
            // i++;
            // } else {
            // i = 0;
            // }
            // }

            index = st.indexOf(st2, index);

            Editor.getTextArea().select(index, (st2.length() + index));
            System.out.println("starting  = " + index);
            index = index + st2.length();

            if (st.indexOf(st2, index) == -1) {
                index = 0;
            }
            if (index >= st.length()) {
                index = 0;
            }

            // Editor.getEFrame().setFocusableWindowState(true); // <<<<<
            // f1.setFocusableWindowState(false);
            // System.out.println(f1.isFocusableWindow());
            // f1.setFocusableWindowState(false);
            Editor.getTextArea().requestFocus();
            // Editor.getEFrame().requestFocus();
            // System.out.println(Editor.getEFrame().isFocusableWindow());
            // }
            // vec1.clear();
            // vec2.clear();

        }
    }

}
