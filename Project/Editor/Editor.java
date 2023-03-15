package Editor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Editor implements ActionListener {
    Frame f;
    MenuBar mb;
    Menu m1, m2, m3;
    MenuItem nw, opn, sve, sveas, ext, ct, cpy, pst, fd, fdr;
    static TextArea ta;
    String spath;
    int i = 0;

    public Editor() {
        f = new Frame("Editor");
        f.setSize(1000, 700);
        f.setVisible(true);
        ta = new TextArea();
        mb = new MenuBar();
        m1 = new Menu("File");
        m1.addActionListener(this);
        m2 = new Menu("Edit");
        m2.addActionListener(this);
        m3 = new Menu("Others");
        m3.addActionListener(this);
        nw = new MenuItem("New");
        nw.addActionListener(this);
        opn = new MenuItem("Open");
        opn.addActionListener(this);
        sve = new MenuItem("Save");
        sve.addActionListener(this);
        sveas = new MenuItem("Save As");
        sveas.addActionListener(this);
        ext = new MenuItem("Exit");
        ext.addActionListener(this);
        ct = new MenuItem("Cut");
        ct.addActionListener(this);
        cpy = new MenuItem("Copy");
        cpy.addActionListener(this);
        pst = new MenuItem("Paste");
        pst.addActionListener(this);
        fd = new MenuItem("Find");
        fd.addActionListener(this);
        fdr = new MenuItem("Find & Replace");
        fdr.addActionListener(this);

        m2.add(fd);
        m2.add(fdr);
        m1.add(nw);
        m1.add(opn);
        m1.add(sve);
        m1.add(sveas);
        m1.addSeparator();
        m1.add(ext);
        mb.add(m1);
        mb.add(m2);
        f.add(ta);
        f.setMenuBar(mb);

    }

    public static TextArea getTextArea() {
        return ta;
    }

    public static void TextSlecte(int a, int b) {
        ta.select(a, b);
        System.out.println("Start = " + ta.getSelectionStart() + "End = " + ta.getSelectionEnd());
    }

    public static void setTextArea(String str1) {
        ta.setText(ta.getText() + str1);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str + " was clicked");
        if (str.equals("New")) {
            ta.setText("");
            i = 0;
        }
        // >>>>>>>> Opne <<<<<<<<<<
        if (str.equals("Open")) {
            ta.setText("");
            FileDialog fd = new FileDialog(f, "LOAD File ", FileDialog.LOAD);
            fd.setVisible(true);
            String path;
            path = fd.getDirectory() + fd.getFile();
            System.out.println(path);
            File fi = new File(path);
            FileInputStream fis;
            BufferedInputStream bis;

            int ch;

            if (fi.exists()) {
                try {
                    fis = new FileInputStream(fi);
                    bis = new BufferedInputStream(fis, 50000);

                    while ((ch = bis.read()) != -1) {
                        String st = "" + (char) ch;
                        ta.setText(ta.getText() + st);
                    }

                    fis.close();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }

            } else {
                System.out.println("file not found");
            }
            i++;
        }
        // >>>>>>>>> Save <<<<<<<<<
        if (str.equals("Save")) {
            DataOutputStream dos;
            FileOutputStream fos;
            if (i == 0) {

                FileDialog fd = new FileDialog(f, "Save File ", FileDialog.SAVE);
                fd.setVisible(true);

                spath = fd.getDirectory() + fd.getFile();

                try {
                    File f = new File(spath);
                    fos = new FileOutputStream(spath, true);
                    dos = new DataOutputStream(fos);
                    if (f.exists()) {

                        String st = ta.getText();
                        dos.writeChars(st);
                        dos.close();
                        i++;
                    }
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            } else {
                File f = new File(spath);
                System.out.println(spath);
                f.delete();
                try {
                    fos = new FileOutputStream(spath, true);
                    dos = new DataOutputStream(fos);
                    if (f.exists()) {

                        String st = ta.getText();
                        dos.writeChars(st);
                        dos.close();
                    }
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            }
        }
        // >>>>>>>>> Save As <<<<<<<<<
        if (str.equals("Save As")) {
            FileDialog fd = new FileDialog(f, "Save File ", FileDialog.SAVE);
            fd.setVisible(true);
            String path;
            path = fd.getDirectory() + fd.getFile();
            DataOutputStream dos;
            try {
                File f = new File(path);
                FileOutputStream fos = new FileOutputStream(path, true);
                dos = new DataOutputStream(fos);
                if (f.exists()) {

                    String st = ta.getText();
                    dos.writeChars(st);
                    dos.close();
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        if (str.equals("Find")) {
            FFrame ff = new FFrame();
        }
        if (str.equals("Find & Replace")) {
            FRFrame ff = new FRFrame();
        }
        if (str.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Editor d = new Editor();
        // TextArea t11 = ta;

        // t11.select(59, 63);
    }
}