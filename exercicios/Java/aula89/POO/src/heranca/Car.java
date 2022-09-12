package heranca;

public class Car extends Vehicle {
    
    private String color;
    private Double price;

    public Car(String color, Double price, String brand, String model){
    super(model, brand);
    this.color = color;
    this.price = price;
    }

    //getters

    public void getColor(String color) {
        this.color = color;
    }

    public void getPrice(Double price) {
        this.price = price;
    }

    //setters

    public String setColor() {
        return this.color;
    }

    public Double setPrice() {
        return this.price;
    }
}
