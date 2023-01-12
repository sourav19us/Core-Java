import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPackageEx {
    public static void main(String[] args) {

        String str = "Java is a high-level, class-based, object-oriented programming language ,Java 12536";
        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.start() + "\t" + m.end() + "\t" + m.group());
        }
        p = Pattern.compile("1");
        m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.start() + "\t" + m.end() + "\t" + m.group());
        }

        p = Pattern.compile("[oO][\\w]+");
        m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.start() + "\t" + m.end() + "\t" + m.group());
        }
    }
}