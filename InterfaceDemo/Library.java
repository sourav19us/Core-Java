import java.io.Console;

import pkg.Book;
import pkg.Dvd;

public class Library {
    public static void main(String[] args) {

        Console con = System.console();

        Book b[] = new Book[10];
        Dvd d[] = new Dvd[10];

        int bk = 0;
        int dvd = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Book or DVD < b / d > :- ");
            String str = con.readLine();
            if (str.equalsIgnoreCase("b")) {
                b[bk] = new Book();
                b[bk].read();
                bk++;
            } else {
                d[dvd] = new Dvd();
                d[dvd].read();
                dvd++;
            }
        }

        for (int i = 0; i < bk; i++) {
            b[i].show();
        }
        for (int i = 0; i < dvd; i++) {
            d[i].show();
        }
    }
}
