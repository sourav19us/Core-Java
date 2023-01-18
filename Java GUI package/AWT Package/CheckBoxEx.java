import java.awt.*;

public class CheckBoxEx {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());
        Checkbox cb1 = new Checkbox("C++", true);
        Checkbox cb2 = new Checkbox("C", true);
        Checkbox cb3 = new Checkbox("Python", false);
        Checkbox cb4 = new Checkbox("Java", true);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb5 = new Checkbox("C++", true, cbg);
        Checkbox cb6 = new Checkbox("C", true, cbg);
        Checkbox cb7 = new Checkbox("Python", false, cbg);
        Checkbox cb8 = new Checkbox("Java", true, cbg);
        f.add(cb5);
        f.add(cb6);
        f.add(cb7);
        f.add(cb8);

        f.setVisible(true);
    }
}
