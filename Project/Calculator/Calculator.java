import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.event.AncestorListener;

public class Calculator implements ActionListener {
    Frame f;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    Panel p1, p2;
    TextField tf;
    Vector vec1 = new Vector();
    Vector vec2 = new Vector();
    Vector vec3 = new Vector();
    Long r;
    int no;

    public Calculator() {
        f = new Frame();
        f.setSize(200, 200);

        f.setVisible(true);
        BorderLayout bl = new BorderLayout();
        f.setLayout(bl);
        p1 = new Panel();
        p1.setBackground(Color.white);
        p2 = new Panel();
        tf = new TextField(25);
        // tf.setEditable(true);
        p1.add(tf);
        GridLayout gl1 = new GridLayout(1, 1);
        p1.setLayout(gl1);
        GridLayout gl2 = new GridLayout(0, 4);
        p2.setLayout(gl2);
        b1 = new Button("1");
        b1.addActionListener(this);
        b2 = new Button("2");
        b2.addActionListener(this);
        b3 = new Button("3");
        b3.addActionListener(this);
        b4 = new Button("+");
        b4.addActionListener(this);
        b5 = new Button("4");
        b5.addActionListener(this);
        b6 = new Button("5");
        b6.addActionListener(this);
        b7 = new Button("6");
        b7.addActionListener(this);
        b8 = new Button("-");
        b8.addActionListener(this);
        b9 = new Button("7");
        b9.addActionListener(this);
        b10 = new Button("8");
        b10.addActionListener(this);
        b11 = new Button("9");
        b11.addActionListener(this);
        b12 = new Button("*");
        b12.addActionListener(this);
        b13 = new Button("C");
        b13.addActionListener(this);
        b14 = new Button("0");
        b14.addActionListener(this);
        b15 = new Button("/");
        b15.addActionListener(this);
        b16 = new Button("=");
        b16.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        // if (str.equals("1"))
        // tf.setText(str);
        StringBuffer strb = new StringBuffer();
        String s = "=";
        if (!((tf.getText()).equals(null))) {

        }

        if (!(str.equals(s))) {
            switch (str) {
                case "1":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "2":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "3":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "+":

                    vec1.add(tf.getText());
                    vec2.add(str);
                    // tf.setText(tf.getText() + str);
                    tf.setText("");
                    vec3.clear();
                    break;
                case "4":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "5":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "6":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "-":
                    vec1.add(tf.getText());
                    vec2.add(str);
                    tf.setText("");
                    vec3.clear();
                    break;
                case "7":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "8":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "9":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "*":

                    vec1.add(tf.getText());
                    vec2.add(str);
                    tf.setText("");
                    vec3.clear();
                    break;
                case "C":
                    tf.setText("");
                    vec1.clear();
                    vec2.clear();
                    vec3.clear();
                    break;
                case "0":
                    vec3.add(str);
                    tf.setText(tf.getText() + str);
                    break;
                case "/":

                    vec1.add(tf.getText());
                    vec2.add(str);
                    tf.setText("");
                    vec3.clear();
                    break;

                default:
                    break;
            }
        } else {
            if (!(tf.getText().equals(""))) {
                vec1.add(tf.getText());
                tf.setText("");
            }
            if (str.equals("=")) {
                if (vec1.size() == 0)
                    System.out.println("Zero");

                for (Object o : vec1) {
                    System.out.println(o);
                }
                for (Object o : vec2) {
                    System.out.println(o);
                    // System.out.println(vec1.size());
                }
            }
            String st[] = { "/", "*", "+", "-" };
            // System.out.println(vec1.size());
            // System.out.println(vec2.size());
            if (vec2.size() < vec1.size()) {
                int vs = vec2.size();
                for (int i = 0; i < vs; i++) {
                    int d = vec2.indexOf("/");
                    int m = vec2.indexOf("*");
                    int a = vec2.indexOf("+");
                    int s1 = vec2.indexOf("-");
                    if (d != -1) {

                        r = Long.parseLong(vec1.get(d) + "") / Long.parseLong(vec1.get(d + 1) + "");
                        vec2.remove(d);
                        vec1.remove(d);
                        vec1.add(d, r + "");
                        vec1.remove(d + 1);
                        System.out.println(r);
                        for (Object o : vec1) {
                            System.out.println(o);
                        }
                        continue;

                    }
                    if (m != -1) {

                        r = Long.parseLong(vec1.get(m) + "") * Long.parseLong(vec1.get(m + 1) + "");
                        vec2.remove(m);
                        vec1.remove(m);
                        vec1.add(m, r + "");
                        vec1.remove(m + 1);
                        System.out.println(r);
                        for (Object o : vec1) {
                            System.out.println(o);
                        }
                        continue;

                    }
                    if (a != -1) {

                        r = Long.parseLong(vec1.get(a) + "") + Long.parseLong(vec1.get(a + 1) + "");
                        vec2.remove(a);
                        vec1.remove(a);
                        vec1.add(a, r + "");
                        vec1.remove(a + 1);
                        System.out.println(r);
                        for (Object o : vec1) {
                            System.out.println(o);
                        }
                        continue;

                    }
                    if (s1 != -1) {

                        r = Long.parseLong(vec1.get(s1) + "") - Long.parseLong(vec1.get(s1 + 1) + "");
                        vec2.remove(s1);
                        vec1.remove(s1);
                        vec1.add(s1, r + "");
                        vec1.remove(s1 + 1);
                        System.out.println(r);
                        for (Object o : vec1) {
                            System.out.println(o);
                        }
                        continue;

                    }
                }
                tf.setText(r + "");
                for (Object o : vec1) {
                    System.out.println(o);
                }
                vec1.clear();
                vec2.clear();

            } else {
                tf.setText("Wrong Expression");
                vec1.clear();
                vec2.clear();

            }

        }

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}