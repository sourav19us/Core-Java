package AnimalsPackage;

import AnimalsPackage.Animals;

public class Dogs extends Animals {

    @Override
    public void sounds() {
        System.out.println("Dogs Bark");
    }

    @Override
    public void move() {
        System.out.println("Dogs Runs");
    }
}
