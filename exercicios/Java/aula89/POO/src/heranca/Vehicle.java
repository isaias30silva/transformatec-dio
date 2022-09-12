package heranca;

public class Vehicle {
    
    public String model;
    public String brand;
    public Boolean isOn = false;

    //super
    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    //getters
    public Boolean getIsOn() {
        return this.isOn;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
