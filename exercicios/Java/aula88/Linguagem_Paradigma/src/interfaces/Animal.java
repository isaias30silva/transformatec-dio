package interfaces;

interface AnimalActions {
    
    public void makesound();
    public void move();

    public default void eat() {
        System.out.println("Come");
    }
}

class Dog implements AnimalActions {

    @Override
    public void makesound() {
        System.out.println("Auauauaua");
    }

    @Override
    public void move() {
        System.out.println("Corre dog");
    }

    public void eat(){}
}

class Bird implements AnimalActions {

    @Override
    public void makesound() {
        System.out.println("Piupiupiupiupiu");
    }

    @Override
    public void move() {
        System.out.println("Voa passarinho");
    }

}

public class Animal{
    public static void main(String[] args) {
        Dog yellowDog = new Dog();

        yellowDog.makesound();
        yellowDog.move();

        Bird louro = new Bird();
        louro.makesound();
        louro.move();
    }
}

