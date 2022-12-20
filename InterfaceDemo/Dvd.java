package pkg;

import java.io.Console;

import pkg.item.Item;

public class Dvd implements Item {
    private String title;
    private String director;
    private String category;

    public void read() {

        Console con = System.console();
        System.out.print("Enter Title of DVD     :-");
        title = con.readLine();

        System.out.print("Enter Directors Name   :-");
        director = con.readLine();

        System.out.print("Enter Category       :-");
        category = con.readLine();
        System.out.println();

    }

    public void show() {
        System.out.println("DVD :- " + title + "  Directors :- " + director + "  Category :- " + category);
    }
}
