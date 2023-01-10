import java.util.*;

enum course {
    java(100, "60 days"),
    cpp(500, "76 days"),
    salesforce(10000, "70 days"),
    BigData(12000, "60 days"),
    python(5000, "30 days");

    private final int fee;
    private final String duration;

    private course(int amount, String period) {
        fee = amount;
        duration = period;
    }

    public int getfee() {
        return fee;
    }

    public String getduration() {
        return duration;
    }
}

public class EnumEx2 {

    public static void main(String[] args) {

        System.out.println("all courses");
        for (course c : course.values()) {
            System.out.println(c + "\t" + c.getfee() + "\t" + c.getduration());
        }

        System.out.println("range of course");
        for (course c : EnumSet.range(course.cpp, course.BigData)) {
            System.out.println(c + "\t" + c.getfee() + "\t" + c.getduration());
        }
    }
}
