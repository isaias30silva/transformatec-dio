package classe;

public class CarCustom {
    
    public static void main(String[] args) throws Exception {
        
        Car car = new Car("ufni89", "Civic", "Honda", 2018, 1);
        Car secondCar = new Car("tist49", "Uno", "Fiat", 2017, 1);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(secondCar.getModel());
        System.out.println(car.getHeight());

        car.setYear(2019);
        System.out.println(car.getYear());
    }
}
