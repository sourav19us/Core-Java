import java.net.spi.InetAddressResolver.LookupPolicy;

import AnimalsPackage.Animals;
import AnimalsPackage.Lions;
import AnimalsPackage.Dogs;

public class Jungle {

    public static void main(String[] args) {
        Animals arr[] = new Animals[2];

        arr[0] = new Lions();
        arr[1] = new Dogs();

        // @foreachLoop
        for (Animals m1 : arr) {
            m1.sounds();
            m1.move();
        }

    }
}
