// package Editor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class Editor implements ActionListener, WindowListener {
    static Frame f;
    MenuBar mb;
    Menu m1, m2, m3;
    MenuItem nw, opn, sve, sveas, ext, ct, cpy, pst, fd, fdr;
    static TextArea ta;
    String spath;
    String path;
    int i = 0, o = 0, s = 0;
    File fi;
    String TAstr;

    public Editor() {
        f = new Frame("Editor");
        f.setSize(500, 700);

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
        f.addWindowListener(this);
        // f.setFocusableWindowState(true); // <<<<<<<<<
        ta.setEditable(true);
        f.setVisible(true); // this is last

    }

    public static Frame getEFrame() {
        return f;
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

    public void save() {

        FileDialog fd = new FileDialog(f, "Save File ", FileDialog.SAVE);
        fd.setVisible(true);

        spath = fd.getDirectory() + fd.getFile();
        System.out.println(spath);
        while (true) {
            if (spath.equals("nullnull")) {
                // System.exit(0);
                fd.setVisible(false);
                ta.setText("");
                break;
            }
            try {
                File f = new File(spath);
                // Create a file writer
                FileWriter wr = new FileWriter(f, false);

                // Create buffered writer to write
                BufferedWriter w = new BufferedWriter(wr);

                // Write
                w.write(ta.getText());

                w.flush();
                w.close();
            } catch (Exception evt) {
                evt.printStackTrace();
            }
            break;
        }

    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str + " was clicked");
        if (str.equals("New")) {
            // System.out.println("text in TaxtArea" + ta.getText());
            // if (ta.getText() == "") {
            // ta.setText("");
            // } else {
            // save();

            // ta.setText("");
            // }
            // i = 0;
            if (ta.getText().equals(TAstr)) {
                ta.setText("");
            } else {
                save();
            }
        }
        // >>>>>>>> Opne <<<<<<<<<<
        if (str.equals("Open")) {
            if (!ta.getText().equals("")) {
                save();
            }
            ta.setText("");
            FileDialog fd = new FileDialog(f, "LOAD File ", FileDialog.LOAD);
            fd.setVisible(true);

            path = fd.getDirectory() + fd.getFile();
            System.out.println(path);
            fi = new File(path);
            o++;
            StringBuffer strb = new StringBuffer();
            FileInputStream fis;
            BufferedInputStream bis;
            /* */
            int ch;
            // Method 1
            if (fi.exists()) {
                try {
                    fis = new FileInputStream(fi);
                    bis = new BufferedInputStream(fis, 50000);

                    while ((ch = bis.read()) != -1) {
                        String st = "" + (char) ch;
                        // ta.setText(ta.getText() + st);
                        strb.append(st);
                    }
                    ta.setText("" + strb);

                    fis.close();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
                TAstr = ta.getText();
            } else {
                System.out.println("file not found");
            }
            // i++;

            // Method 2

            // try {
            // Scanner sc = new Scanner(fi);
            // while (sc.hasNextLine()) {
            // // System.out.println(sc.nextLine());
            // // ta.setText(ta.getText() + "\n" + sc.nextLine());
            // strb.append(sc.nextLine() + "\n");
            // }
            // ta.setText("" + strb);
            // }

            // catch (FileNotFoundException e1) {
            // // TODO Auto-generated catch block
            // e1.printStackTrace();
            // }

            // try {
            // FileInputStream fis = new FileInputStream(fi);
            // BufferedInputStream bis = new BufferedInputStream(fis);
            // byte[] buffer = new byte[10000000];
            // int read;
            // while ((read = bis.read(buffer, 0, buffer.length)) != -1) {
            // ta.setText(ta.getText() + "\n" + bis.read(buffer, 0, read));
            // }
            // } catch (Exception e2) {
            // // TODO: handle exception
            // e2.printStackTrace();
            // }
        }
        // >>>>>>>>> Save <<<<<<<<<
        if (str.equals("Save")) {
            TAstr = ta.getText();
            if (o == 0) {
                save();
            } else {
                if (fi.exists()) {
                    fi.delete();
                }
                // DataOutputStream dos;
                try {
                    File fl = new File(path);

                    // Create a file writer
                    FileWriter wr = new FileWriter(fl, false);

                    // Create buffered writer to write
                    BufferedWriter w = new BufferedWriter(wr);
                    System.out.println("File  <<<<<<<<<< ");
                    // Write
                    w.write(ta.getText());

                    w.flush();
                    w.close();

                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }

                // File f;
                // try {
                // f = new File(path);
                // FileOutputStream fos = new FileOutputStream(f);
                // BufferedOutputStream bos = new BufferedOutputStream(fos, 2000000000);
                // byte[] buffer = new byte[10000000];
                // bos.write(buffer, 0, buffer.length);
                // bos.flush();
                // bos.close();
                // fos.close();

                // } catch (Exception e2) {
                // // TODO: handle exception
                // e2.printStackTrace();
                // }
                // }
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
                    fos.close();
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        if (str.equals("Find")) {
            FFrame ff = new FFrame();
            // FFrame.getEFrame().setFocusableWindowState(true); // <<<<<<<
        }
        if (str.equals("Find & Replace")) {
            FRFrame ff = new FRFrame();
        }
        if (str.equals("Exit")) {
            save();
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowOpened'");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowClosing'");
        System.out.println(ta.getText());
        TAstr = ta.getText();
        if (TAstr != null) {

            if (!TAstr.equals(ta.getText())) {

                save();
                System.out.println("Clicked on Windowclosing");
                System.exit(0);
            } else {
                System.out.println("Clicked on Windowclosing");
                System.exit(0);

            }
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowClosed'");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowIconified'");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowDeiconified'");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowActivated'");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'windowDeactivated'");
    }

    public static void main(String[] args) {
        Editor d = new Editor();
        // TextArea t11 = ta;

        // t11.select(59, 63);
    }

}