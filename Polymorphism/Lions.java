package AnimalsPackage;

import AnimalsPackage.Animals;

public class Lions extends Animals {

    @Override
    public void sound() {
        System.out.println("Lions Roar");
    }

    @Override
    public void move() {
        System.out.println("Lions Runs");
    }

}
