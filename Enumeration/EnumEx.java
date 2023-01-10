import java.util.EnumSet;

public class EnumEx {
    enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;
    }

    public static void main(String[] args) {
        Month month_of_joing;
        month_of_joing = Month.February;
        System.out.println(month_of_joing);

        // to retrive all members
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<");
        for (Month m : Month.values()) {
            System.out.println(m);
        }

        // to retrive a range of members
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<");
        for (Month m : EnumSet.range(Month.July, Month.October)) {
            System.out.println(m);
        }
        System.out.println(">>>>>>>>>>>>>><<<<<<<<<<<<<");
    }
}
