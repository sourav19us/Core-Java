package AnimalsPackage;

import AnimalsPackage.Animals;

public class Dogs extends Animals {

    @Override
    public void sound() {
        System.out.println("Dogs Bark");
    }

    @Override
    public void move() {
        System.out.println("Dogs Runs");
    }

}
