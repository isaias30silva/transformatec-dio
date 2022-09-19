package classes;

public class Car {
    private String model;
    protected String brand;
    public Integer year;

    public Car(String model, String brand) {
        this.brand = brand;
        this.model = model;
        //this.year = year;
    }


    //getters
    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public Integer getYear() {
        return this.year;
    }

    //setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void accelerate() {
        System.out.println("Vrooom");
    }

    public void brake() {
        System.out.println("Shhhhhh");
    }
}