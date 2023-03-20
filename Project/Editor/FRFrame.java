// package Editor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Vector;
import java.util.regex.*;

public class FRFrame extends WindowAdapter implements ActionListener {
    Frame f1;
    TextField tf1, tf2;
    Vector<Integer> vec1 = new Vector<Integer>();
    Vector<Integer> vec2 = new Vector<Integer>();
    int i = 0, index = 0, startingPoint = 0;
    String st3;

    public FRFrame() {
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
        tf1 = new TextField(15);
        gbl.gridx = 0;
        gbl.gridy = 1;
        f1.add(tf1, gbl);
        Label l1 = new Label("Replace With");
        gbl.gridx = 0;
        gbl.gridy = 2;
        f1.add(l1, gbl);
        tf2 = new TextField(15);
        gbl.gridx = 0;
        gbl.gridy = 3;
        f1.add(tf2, gbl);
        Button b1 = new Button("FindNext");
        b1.addActionListener(this);
        gbl.gridx = 0;
        gbl.gridy = 4;
        f1.add(b1, gbl);
        Button b2 = new Button("Replace");
        b2.addActionListener(this);
        gbl.gridx = 1;
        gbl.gridy = 4;
        f1.add(b2, gbl);
        Button b3 = new Button("Replace All");
        b3.addActionListener(this);
        gbl.gridx = 3;
        gbl.gridy = 4;
        f1.add(b3, gbl);
        Button b4 = new Button("Close");
        b4.addActionListener(this);
        gbl.gridx = 4;
        gbl.gridy = 4;
        f1.add(b4, gbl);
        f1.setVisible(true);

    }

    public void find() {

        TextArea ta1 = Editor.getTextArea();
        String st = ta1.getText();
        String st2 = tf1.getText();
        st = st.replace("\r", "");
        st = st.replace("\n", " ");

        index = st.indexOf(st2, index);
        if (index > 0) {

            Editor.getTextArea().select(index, (st2.length() + index));
        }
        System.out.println("starting  = " + index);
        startingPoint = index;
        index = index + st2.length();

        if (st.indexOf(st2, index) == -1) {
            index = 0;
        }
        if (index >= st.length()) {
            index = 0;
        }
        ta1.requestFocus();
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

            find();

        }

        if (str.equals("Replace")) {

            TextArea ta1 = Editor.getTextArea();
            String st = ta1.getText();
            String st2 = tf1.getText();
            st = st.replace("\r", "");
            st = st.replace("\n", " ");
            // Pattern p = Pattern.compile(st2);
            // Matcher m = p.matcher(st);

            // while (m.find()) {
            // System.out.println(m.start() + " " + m.end() + " " + m.group());
            // vec1.add(m.start());
            // vec2.add(m.end());
            // }
            // if (i == 0) {
            // while (m.find()) {

            // System.out.println(m.start() + " " + m.end() + " " + m.group());
            // vec1.add(m.start());
            // vec2.add(m.end());
            // // Editor.getTextArea().setText(m.replaceFirst(tf2.getText()));
            // }
            // }

            // System.out.println(vec1.size());
            // System.out.println(vec2.size());
            // if (i < vec1.size()) {
            // Editor.getTextArea().select(vec1.get(0), vec2.get(0));
            // Editor ed = new Editor();
            // if (vec1.size() != 0) {

            // if (i < (vec1.size() - 1)) {
            // Editor.getTextArea().replaceRange(tf2.getText(), vec1.get(0), vec2.get(0));
            // i++;
            // } else {
            // i = 0;
            // }

            // }
            // Editor.getTextArea().requestFocus();
            // vec1.clear();
            // vec2.clear();
            System.out.println(
                    "startingPoint = " + startingPoint + "\n" + "tf2.getText().length() = " + tf2.getText().length());
            System.out.println("startingPoint + tf2.getText().length() = " + (startingPoint + tf2.getText().length()));
            System.out.println("startingPoint - tf2.getText().length() = " + (startingPoint - tf2.getText().length()));
            if (startingPoint > 0) {
                Editor.getTextArea().replaceText(tf2.getText(), startingPoint,
                        (startingPoint + tf1.getText().length()));
            } else {
                f1.requestFocus();
            }
            find();

        }

        if (str.equals("Replace All")) {
            TextArea ta1 = Editor.getTextArea();
            String st = ta1.getText();
            String st2 = tf1.getText();
            Pattern p = Pattern.compile(st2);
            Matcher m = p.matcher(st);

            if (m.find()) {

                // System.out.println(m.start() + " " + m.end() + " " + m.group());

                // vec1.add(m.start());

                // vec2.add(m.end());
                Editor.getTextArea().setText(m.replaceAll(tf2.getText()));
            }
        }
    }
}
