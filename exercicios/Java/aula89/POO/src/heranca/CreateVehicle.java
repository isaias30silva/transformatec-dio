package heranca;

public class CreateVehicle {
    
    public static void main(String[] args) throws Exception {
        
        Car car = new Car("cinza", 110.000, "honda", "civic");

        System.out.println(car.getIsOn());
        car.turnOn();
        System.out.println(car.getIsOn());
        car.turnOff();
        System.out.println(car.getIsOn());

    }
}
