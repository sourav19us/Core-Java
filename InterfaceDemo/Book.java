package pkg;

import java.io.Console;

import pkg.item.Item;

public class Book implements Item {
    private String title;
    private String author;
    private String publication;

    public void read() {

        Console con = System.console();
        System.out.print("Enter Title of Book  :-");
        title = con.readLine();

        System.out.print("Enter Authors Name   :-");
        author = con.readLine();

        System.out.print("Enter Publication    :-");
        publication = con.readLine();
        System.out.println();

    }

    public void show() {
        System.out.println("Book :- " + title + "  Authors :- " + author + "  Publication :- " + publication);
    }
}
