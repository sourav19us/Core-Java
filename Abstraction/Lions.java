package AnimalsPackage;

import AnimalsPackage.Animals;

public class Lions extends Animals {

    @Override
    public void sounds() {
        System.out.println("Lions Roar");
    }

    @Override
    public void move() {
        System.out.println("Lions Runs");
    }
}
