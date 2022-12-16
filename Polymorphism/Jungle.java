import AnimalsPackage.Animals;
import AnimalsPackage.Lions;
import AnimalsPackage.Dogs;
import AnimalsPackage.Cows;

// import AnimalsPackage.*;

public class Jungle {

    public static void main(String[] args) {

        Animals m1[] = new Animals[3];

        m1[0] = new Lions();
        m1[1] = new Dogs();
        m1[2] = new Cows();

        for (Animals ref : m1) {
            ref.sound();
            ref.move();
        }
    }
}
