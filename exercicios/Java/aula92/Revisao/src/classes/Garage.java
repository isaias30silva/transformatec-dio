package classes;

public class Garage {
    
    public static void main(String[] args) throws Exception {
        Car car = new Car("Saveiro", "W");
        car.accelerate();
        car.brake();

        System.out.println(car.getModel());
        System.out.println(car.brand);
        car.setYear(2010);
        //System.out.println(car.model);
        System.out.println(car.year);
    }
}
