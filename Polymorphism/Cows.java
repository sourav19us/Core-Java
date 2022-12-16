package AnimalsPackage;

import AnimalsPackage.Animals;

public class Cows extends Animals {

    @Override
    public void sound() {
        System.out.println("Cows Moo");
    }

    @Override
    public void move() {
        System.out.println("Cows Runs");
    }
}
