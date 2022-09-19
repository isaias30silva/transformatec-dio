package polimorphysm.override;

//superclasse
class Vehicle {
    public void move() {
        System.out.println("Moving");
    }
}

//subclasses
class Car extends Vehicle {
    public void move() {
        System.out.println("Car moving on land");
    }
}

class Airplane extends Vehicle {
    @Override
    public void move() {
        System.out.println("Airplane is flying");
    }
}

public class Vehicles {
    public static void main(String[] args) throws Exception {
        Airplane plane = new Airplane();
        Car car = new Car();
        
        car.move();
        plane.move();
    }
}